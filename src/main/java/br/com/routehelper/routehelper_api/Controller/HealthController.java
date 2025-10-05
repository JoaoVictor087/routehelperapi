package br.com.routehelper.routehelper_api.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> getHealthStatus() {
        Map<String, String> status = Map.of(
                "status", "UP",
                "version", "1.1.0",
                "description", "RouteHelper API is running"
        );
        return ResponseEntity.ok(status);
    }
}
