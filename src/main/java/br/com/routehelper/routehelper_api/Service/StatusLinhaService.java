package br.com.routehelper.routehelper_api.Service;

import br.com.routehelper.routehelper_api.Controller.RotaController;
import br.com.routehelper.routehelper_api.entities.StatusLinha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class StatusLinhaService {
    private static final Logger log = LoggerFactory.getLogger(StatusLinhaService.class);
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://www.diretodostrens.com.br/api/status";

    public List<StatusLinha> buscarSituacaoLinha() {
        try {
            StatusLinha[] statusLinhasArray = restTemplate.getForObject(apiUrl, StatusLinha[].class);
            return List.of(statusLinhasArray);
        }catch (Exception e){
            log.error("Erro ao buscar status");
            log.error(e.getMessage());
            return List.of();
        }
     }
}
