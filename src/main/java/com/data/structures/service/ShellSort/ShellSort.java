package com.data.structures.service.ShellSort;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.Ordenacao;

public class ShellSort implements Ordenacao {

    public ResponseResults ordenar(int[] vetor, ResponseSort res){
        return shellSort(vetor, res);
    }

    public ResponseResults shellSort(int[] vetor, ResponseSort res){

        ResponseResults results = new ResponseResults();
        results.setNomeAlgoritmo("Shell Sort");

        int elemento, j;
        int h = 1;
        int n = vetor.length;

        results.setTempoInicial(System.currentTimeMillis());

        while (h < n){
            h = h * 3 + 1;

        }
        h = (int) Math.floor(h / 3);
        while ( h > 0){
            for(int i=h; i<n; i++){
                elemento = vetor[i];
                j = i;
                while((j>= h) && (vetor[j-h]>elemento)){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                    results.setOperacoes(results.getOperacoes()+1);
                }
                vetor[j] = elemento;
                results.setOperacoes(results.getOperacoes()+1);
            }
            h = h / 2;
        }

        results.setTempoFinal(System.currentTimeMillis());
        results.setTempoTotal(results.getTempoFinal() - results.getTempoInicial());
        res.setVetorOrdenado(vetor);
        return results;
    }

}
