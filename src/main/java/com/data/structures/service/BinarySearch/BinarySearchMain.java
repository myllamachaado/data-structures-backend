package com.data.structures.service.BinarySearch;

import com.data.structures.model.response.ResponseSearch;

public class BinarySearchMain {

   public static void main(String[] args) {
      int[] vetor = new int[10];
      int search = 3;

      for(int i = 0; i < vetor.length; i++){
         vetor[i] = i * 2;
      }

      ResponseSearch res = BinarySearch.buscaBinaria(vetor, search);

      if (res.getIndex() == -1){
         System.out.println("Searched item: " + search + " | Item is not on the list.");
      }
      else{
         System.out.println("Searched item: " + search + " | The item is in the index " + res.getIndex() + ".");
      }

   }

}
