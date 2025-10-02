package br.com.routehelper.routehelper_api.Controller;

import br.com.routehelper.routehelper_api.Service.GrafoService;
import br.com.routehelper.routehelper_api.Service.RotaService;
import br.com.routehelper.routehelper_api.entities.Estacao;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/rotas")
public class RotaController {
    private static final Logger log = LoggerFactory.getLogger(RotaController.class);
    private RotaService rotaService;

    @GetMapping
    public ResponseEntity<?>obterRota(@RequestParam String origem, @RequestParam String destino){
        List<Estacao> rotaCalculada = rotaService.calcularRota(origem, destino);

        if(rotaCalculada.isEmpty()){
            return new ResponseEntity<>("Rota não encontrada",HttpStatus.NOT_FOUND);
        }
        List<String> nomesDasEstacoes = rotaCalculada.stream()
                .map(Estacao::getNome)
                .collect(Collectors.toList());
        log.info("Rota calculada com sucesso");
        return new ResponseEntity<>(nomesDasEstacoes, HttpStatus.OK);
    }
}
