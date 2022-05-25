package com.data.structures.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class ResponseSearch {

   private String algotitmo;
   //Linear search
   private ArrayList indexes;
   // Binary Search
   private int index;
   private long tempoInicial;
   private long tempoFinal;
   private int operacoes;

}
