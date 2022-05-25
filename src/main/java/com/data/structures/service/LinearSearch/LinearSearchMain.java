package com.data.structures.service.LinearSearch;

import java.util.ArrayList;
import java.util.stream.Stream;
public class LinearSearchMain {

   public static void main(String[] args) {
      int[] vetor = new int[10];
      int search = 7;

      for(int i = 0; i < vetor.length; i++){
         vetor[i] = (int) (Math.random() * 10);
      }

      int index = LinearSearch.buscaOcorrencia(vetor, search);

      if(index == -1)
         System.out.println("Searched item: " + search + " | Item is not on the list.");
      else
         System.out.println("Searched item: " + search + " | The item is in the index " + index + ".");

      //---------------------------------------------------------------------------------------

      ArrayList indexes = LinearSearch.buscaTodasAsOcorrencias(vetor, search);

      if(indexes.size() == 0) {
         System.out.println("Searched item: " + search + " | Indexes: Item is not on the list.");
      }
      else {
         System.out.println("Searched item: " + search + " | Indexes: ");
                 Stream.of(indexes).forEach(i -> System.out.println(i));
      }

   }

}
