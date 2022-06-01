package com.data.structures.service.SelectionSort;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements Ordenacao{

   public ResponseResults ordenar(int[] vetor, ResponseSort res){
      return selectionSort(vetor, res);
   }

   public static ResponseResults selectionSort(int[] vetor, ResponseSort res){
      int menor;
      int aux;

      ResponseResults results = new ResponseResults();

      results.setNomeAlgoritmo("Selection Sort");
      results.setTempoInicial(System.currentTimeMillis());

      for(int i = 0; i < vetor.length; i++) {
         menor = i;
         for (int j = i + 1; j < vetor.length; j++) {
            if(vetor[j] < vetor[menor]){
               menor = j;
            }
         }
         aux = vetor[menor];
         vetor[menor] = vetor[i];
         vetor[i] = aux;
         results.setOperacoes(results.getOperacoes()+1);
      }

      results.setTempoFinal(System.currentTimeMillis());
      results.setTempoTotal(results.getTempoFinal() - results.getTempoInicial());
      res.setVetorOrdenado(vetor);
      return results;
   }

}
