package com.data.structures.service.BinarySearch;

import com.data.structures.model.response.ResponseSearch;

public class BinarySearch {

   public static ResponseSearch buscaBinaria(int[] vetor, int search){
      ResponseSearch res = new ResponseSearch();
      // Essa busca retorna apenas um elemento então esse campo não é necessário :)
      res.setIndexes(null);
      res.setAlgotitmo("Binary Search");

      int start = 0;
      int end = vetor.length - 1;
      int middle;

      while(start <= end){
         middle = (int) ((start + end) / 2);
         res.setOperacoes(res.getOperacoes()+1);
         if(vetor[middle] == search){
            res.setIndex(middle);
            return res;
         }
         else if(vetor[middle] < search){
            start = middle + 1;
         }
         else{
            end = middle - 1;
         }
      }
      return res;
   }
}
