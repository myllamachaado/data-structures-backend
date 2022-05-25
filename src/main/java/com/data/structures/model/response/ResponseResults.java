package com.data.structures.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseResults {
    private String nomeAlgoritmo;
    private long tempoInicial;
    private long tempoFinal;
    private long tempoTotal;
    private int operacoes;
}
