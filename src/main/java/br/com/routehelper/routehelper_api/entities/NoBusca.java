package br.com.routehelper.routehelper_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NoBusca implements Comparable<NoBusca> {
    private Estacao estacao;
    private double custoG; // Custo do início até o nó atual
    private double custoH; // Heurística (custo estimado até o destino)
    private NoBusca pai;

    public double getCustoF() {
        return custoG + custoH;
    }

    @Override
    public int compareTo(NoBusca outro) {
        return Double.compare(this.getCustoF(), outro.getCustoF());
    }
}

