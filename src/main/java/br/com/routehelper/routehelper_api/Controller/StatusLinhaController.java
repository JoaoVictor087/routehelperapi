package br.com.routehelper.routehelper_api.Controller;

import br.com.routehelper.routehelper_api.Service.StatusLinhaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/StatusLinha")
@RestController
@AllArgsConstructor
public class StatusLinhaController {
    private static final Logger log = LoggerFactory.getLogger(StatusLinhaController.class);
    private StatusLinhaService statusLinhaService;

    @GetMapping
    public ResponseEntity<?>verificarStatusLinha(){
        try{
            return new ResponseEntity<>(statusLinhaService.buscarSituacaoLinha(),HttpStatus.OK);
        }catch (Exception e){
            log.error("Erro interno do servidor");
            log.error(e.getMessage());
            return new ResponseEntity<>("Erro interno do Servidor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
