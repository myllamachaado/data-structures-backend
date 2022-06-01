package com.data.structures.service.LinearSearch;

import com.data.structures.model.response.ResponseSearch;
import com.data.structures.service.Busca;

import java.util.ArrayList;

public class LinearSearch implements Busca {

   public ResponseSearch buscar(int[] vetor, int search, ResponseSearch res){
      return buscaOcorrencia(vetor, search, res);
   }

   // Retona um único índice (primeira ocorrência) mesmo que o número esteja repetido no vetor
   public static ResponseSearch buscaOcorrencia(int[] vetor, int search, ResponseSearch res){

      res.setAlgotitmo("Busca Linear");
      res.setVetor(vetor);

      res.setTempoInicial(System.currentTimeMillis());
      for (int i = 0; i < vetor.length; i++) {
         res.setOperacoes(res.getOperacoes()+1);
         if(vetor[i] == search){
            res.setIndex(i);
            res.setTempoFinal(System.currentTimeMillis());
            res.setTempoTotal(res.getTempoFinal() - res.getTempoInicial());
            return res;
         }
      }
      res.setTempoFinal(System.currentTimeMillis());
      res.setTempoTotal(res.getTempoFinal() - res.getTempoInicial());
      return res;
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
