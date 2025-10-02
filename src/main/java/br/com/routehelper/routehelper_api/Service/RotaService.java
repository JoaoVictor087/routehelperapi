package br.com.routehelper.routehelper_api.Service;

import br.com.routehelper.routehelper_api.entities.Estacao;
import br.com.routehelper.routehelper_api.entities.NoBusca;
import com.google.common.graph.MutableValueGraph;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class RotaService {
    private GrafoService grafoService;

    public List<Estacao> calcularRota(String nomeOrigem, String nomeDestino) {
        MutableValueGraph<Estacao, Double> grafo = grafoService.getGrafo();

        // Encontra as estações de início e fim no grafo
        Optional<Estacao> inicioOpt = findEstacaoByNome(nomeOrigem, grafo.nodes());
        Optional<Estacao> destinoOpt = findEstacaoByNome(nomeDestino, grafo.nodes());

        if (inicioOpt.isEmpty() || destinoOpt.isEmpty()) {
            // Lançar uma exceção ou retornar lista vazia se as estações não existem
            return List.of();
        }

        Estacao inicio = inicioOpt.get();
        Estacao destino = destinoOpt.get();

        // Lógica do A*
        PriorityQueue<NoBusca> openSet = new PriorityQueue<>();
        Set<Estacao> closedSet = new HashSet<>();

        NoBusca noInicial = new NoBusca(inicio, 0, calcularHeuristica(inicio, destino), null);
        openSet.add(noInicial);

        while (!openSet.isEmpty()) {
            NoBusca noAtual = openSet.poll();

            if (noAtual.getEstacao().equals(destino)) {
                return reconstruirCaminho(noAtual);
            }

            closedSet.add(noAtual.getEstacao());

            for (Estacao vizinho : grafo.adjacentNodes(noAtual.getEstacao())) {
                if (closedSet.contains(vizinho)) {
                    continue;
                }

                double novoCustoG = noAtual.getCustoG() + grafo.edgeValueOrDefault(noAtual.getEstacao(), vizinho, Double.MAX_VALUE);
                NoBusca novoNoVizinho = new NoBusca(vizinho, novoCustoG, calcularHeuristica(vizinho, destino), noAtual);

                if (!openSet.contains(novoNoVizinho) || novoCustoG < getCustoGFromOpenSet(openSet, vizinho)) {
                    openSet.removeIf(n -> n.getEstacao().equals(vizinho)); // Otimização
                    openSet.add(novoNoVizinho);
                }
            }
        }
        return List.of(); // Rota não encontrada
    }

    private double calcularHeuristica(Estacao inicio, Estacao destino) {
        final double RAIO_TERRA = 6371.0; // em km
        double lat1Rad = Math.toRadians(inicio.getX());
        double lon1Rad = Math.toRadians(inicio.getY());
        double lat2Rad = Math.toRadians(destino.getX());
        double lon2Rad = Math.toRadians(destino.getY());

        double deltaLat = lat2Rad - lat1Rad;
        double deltaLon = lon2Rad - lon1Rad;

        double a = Math.pow(Math.sin(deltaLat / 2), 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                        Math.pow(Math.sin(deltaLon / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return RAIO_TERRA * c * 1000; // Retorna em metros para ser consistente
    }

    private List<Estacao> reconstruirCaminho(NoBusca noFinal) {
        LinkedList<Estacao> caminho = new LinkedList<>();
        NoBusca atual = noFinal;
        while (atual != null) {
            caminho.addFirst(atual.getEstacao());
            atual = atual.getPai();
        }
        return caminho;
    }

    private Optional<Estacao> findEstacaoByNome(String nome, Set<Estacao> estacoes) {
        return estacoes.stream()
                .filter(e -> e.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }

    private double getCustoGFromOpenSet(PriorityQueue<NoBusca> openSet, Estacao estacao) {
        return openSet.stream()
                .filter(n -> n.getEstacao().equals(estacao))
                .findFirst()
                .map(NoBusca::getCustoG)
                .orElse(Double.MAX_VALUE);
    }
}

