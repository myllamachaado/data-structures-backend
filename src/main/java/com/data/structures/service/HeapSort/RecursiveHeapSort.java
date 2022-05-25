package com.data.structures.service.HeapSort;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.Ordenacao;

public class RecursiveHeapSort implements Ordenacao{

   public ResponseResults ordenar(int[] vetor, ResponseSort res){
      return recursiveHeapSort(vetor, res);
   }
   public static ResponseResults recursiveHeapSort(int[] vetor, ResponseSort res){

      ResponseResults results = new ResponseResults();

      results.setNomeAlgoritmo("Heap Sort Recursivo");
      results.setTempoInicial(System.currentTimeMillis());

      int n = vetor.length;
      for(int i = n/2 -1; i >= 0; i--){
         heap(vetor, n, i, results);
      }

      for(int j = n-1; j > 0; j--){
         int aux = vetor[0];
         vetor[0] = vetor[j];
         vetor[j] = aux;
         results.setOperacoes(results.getOperacoes()+1);
         heap(vetor, j, 0, results);
      }

      results.setTempoFinal(System.currentTimeMillis());
      results.setTempoTotal(results.getTempoFinal() - results.getTempoInicial());
      res.setVetorOrdenado(vetor);
      return results;
   }

   private static void heap(int[] vetor, int n, int i, ResponseResults results){
      int raiz = i;
      int left = 2*i+1;
      int right = 2*i+2;

      if ((left < n)&&(vetor[left] > vetor[raiz])){
         raiz = left;
      }

      if ((right < n)&&(vetor[right] > vetor[raiz])){
         raiz = right;
      }

      if(raiz != i){
         int aux = vetor[i];
         vetor[i] = vetor[raiz];
         vetor[raiz] = aux;
         results.setOperacoes(results.getOperacoes()+1);
         heap(vetor, n, raiz, results);
      }
   }
}
