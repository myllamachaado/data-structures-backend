package com.data.structures.service.InsertionSort;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements Ordenacao {

   public ResponseResults ordenar(int[] vetor, ResponseSort res){
      return insertionSort(vetor, res);
   }

   public static ResponseResults insertionSort(int[] vetor, ResponseSort res){
      int aux;
      int j;

      ResponseResults results = new ResponseResults();

      results.setNomeAlgoritmo("Insertion Sort");
      results.setTempoInicial(System.currentTimeMillis());
      for(int i = 1; i < vetor.length; i++){
         aux = vetor[i];
         j = i-1;
         while((j >= 0)&&(vetor[j] > aux)){
            vetor[j+1] = vetor[j];
            j--;
            results.setOperacoes(results.getOperacoes()+1);
         }
         vetor[j+1] = aux;
         results.setOperacoes(results.getOperacoes()+1);
      }
      results.setTempoFinal(System.currentTimeMillis());
      results.setTempoTotal(results.getTempoFinal() - results.getTempoInicial());
      res.setVetorOrdenado(vetor);
      return results;
   }
}
