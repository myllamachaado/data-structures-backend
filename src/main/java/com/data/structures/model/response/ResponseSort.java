package com.data.structures.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ResponseSort {

   private int[] vetor;
   private int[] vetorOrdenado;
   private List<ResponseResults> estatisticas;

}
