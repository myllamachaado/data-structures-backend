package com.data.structures.service.BubbleSort;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.Ordenacao;

public class BubbleSort implements Ordenacao {

   public ResponseResults ordenar(int[] vetor, ResponseSort res){
      return bubbleSort(vetor, res);
   }

   public static ResponseResults bubbleSort(int[] vetor, ResponseSort res){
      int aux;

      ResponseResults results = new ResponseResults();

      results.setNomeAlgoritmo("Bubble Sort");
      results.setTempoInicial(System.currentTimeMillis());

      for(int i = 0; i < vetor.length; i++){
         for(int j = i+1; j < vetor.length; j++){
            if(vetor[i] > vetor[j]){
               aux = vetor[i];
               vetor[i] = vetor[j];
               vetor[j] = aux;
               results.setOperacoes(results.getOperacoes()+1);
            }
         }
      }
      results.setTempoFinal(System.currentTimeMillis());
      results.setTempoTotal(results.getTempoFinal() - results.getTempoInicial());
      res.setVetorOrdenado(vetor);
      return results;
   }
}
