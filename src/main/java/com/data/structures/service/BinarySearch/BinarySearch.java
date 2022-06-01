package com.data.structures.service.BinarySearch;

import com.data.structures.model.response.ResponseSearch;
import com.data.structures.service.Busca;

public class BinarySearch implements Busca {

   public ResponseSearch buscar(int[] vetor, int search, ResponseSearch res){
      return buscaBinaria(vetor, search, res);
   }

   public static ResponseSearch buscaBinaria(int[] vetor, int search, ResponseSearch res){
      res.setAlgotitmo("Binary Search");
      res.setVetor(vetor);
      int start = 0;
      int end = vetor.length - 1;
      int middle;

      res.setTempoInicial(System.currentTimeMillis());

      while(start <= end){
         middle = (int) ((start + end) / 2);
         res.setOperacoes(res.getOperacoes()+1);
         if(vetor[middle] == search){
            res.setIndex(middle);
            res.setTempoFinal(System.currentTimeMillis());
            res.setTempoTotal(res.getTempoFinal() - res.getTempoInicial());
            return res;
         }
         else if(vetor[middle] < search){
            start = middle + 1;
         }
         else{
            end = middle - 1;
         }
      }
      res.setTempoFinal(System.currentTimeMillis());
      res.setTempoTotal(res.getTempoFinal() - res.getTempoInicial());
      return res;
   }
}
