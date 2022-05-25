package com.data.structures.service.LinearSearch;

import java.util.ArrayList;

public class LinearSearch {

   // Retona um único índice (primeira ocorrência) mesmo que o número esteja repetido no vetor
   public static int buscaOcorrencia(int[] elements, int search){
      for (int i = 0; i < elements.length; i++) {
         if(elements[i] == search){
            return i;
         }
      }
      return -1;
   }

   // Retorna todas as ocorrências do item no vetor
   public static ArrayList buscaTodasAsOcorrencias(int[] elements, int search){
      ArrayList indexes = new ArrayList();

      for (int i = 0; i < elements.length; i++) {
         if(elements[i] == search){
            indexes.add(i);
         }
      }
      return indexes;
   }

}
