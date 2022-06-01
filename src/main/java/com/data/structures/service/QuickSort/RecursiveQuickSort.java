package com.data.structures.service.QuickSort;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.Ordenacao;

public class RecursiveQuickSort implements Ordenacao{

   public ResponseResults ordenar(int[] vetor, ResponseSort res){
      return recursiveQuickSort(vetor, 0, vetor.length, res);
   }

   public static ResponseResults recursiveQuickSort(int[] vetor, int left, int right, ResponseSort res){

      ResponseResults results = new ResponseResults();
      results.setNomeAlgoritmo("QuickSort Recursivo");

      results.setTempoInicial(System.currentTimeMillis());

      if(left < right){
         int pivot = partition(vetor, left, right, results);
         recursiveQuickSort(vetor, left, pivot, res);
         recursiveQuickSort(vetor, pivot+1, right, res);
      }

      results.setTempoFinal(System.currentTimeMillis());
      results.setTempoTotal(results.getTempoFinal() - results.getTempoInicial());
      res.setVetorOrdenado(vetor);

      return results;
   }

   public static int partition(int[] vetor, int left, int right, ResponseResults results){
      int aux;
      int p = (int) (left+right)/2;
      int pivot = vetor[p];
      int i = left - 1;
      int j = right;
      while(true){
         do{
            i++;
         }while(vetor[i]<pivot);
         do{
            j--;
         }while(vetor[j]>pivot);
         if(i>=j){
            return j;
         }
         aux = vetor[i];
         vetor[i] = vetor[j];
         vetor[j] = aux;
         results.setOperacoes(results.getOperacoes()+1);
      }
   }
}
