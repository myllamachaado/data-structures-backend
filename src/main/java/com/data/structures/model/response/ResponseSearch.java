package com.data.structures.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class ResponseSearch {
   private int[] vetor;
   private String algotitmo;
   private int index;
   private long tempoInicial;
   private long tempoFinal;
   private long tempoTotal;
   private int operacoes;

}
