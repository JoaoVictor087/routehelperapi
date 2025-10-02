package br.com.routehelper.routehelper_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StatusLinha {
    private int codigo;
    private String situacao;
}
