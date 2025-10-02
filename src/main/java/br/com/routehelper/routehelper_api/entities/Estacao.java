package br.com.routehelper.routehelper_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = "nome")
@AllArgsConstructor
@NoArgsConstructor
public class Estacao {
    private String nome;
    private double x;
    private double y;
}
