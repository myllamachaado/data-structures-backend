package com.data.structures.service;

import com.data.structures.model.DataBusca;
import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSearch;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.BinarySearch.BinarySearch;
import com.data.structures.service.LinearSearch.LinearSearch;
import com.data.structures.service.QuickSort.RecursiveQuickSort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Service
public class BuscaService{

    public ResponseSearch busca(DataBusca data){

        ResponseSearch response = new ResponseSearch();
        Integer quantidade = data.getQuantidade();
        Integer algoritmo = data.getAlgoritmo();
        Integer search = data.getNumeroBuscado();

        int[] vetor = criaVetor(quantidade);
        vetor = criaLista(vetor);

        switch(algoritmo){
            case 1:
                response = LinearSearch.buscaOcorrencia(vetor, search, response);
                break;
            case 2:
                // Passo 1 - Ordena o vetor usando quick sort
                ResponseSort ordenar = new ResponseSort();
                List<ResponseResults> result = new ArrayList<>();
                result.add(new RecursiveQuickSort().ordenar(vetor.clone(), ordenar));
                // Passo 2 - Executa a busca binária
                response = BinarySearch.buscaBinaria(ordenar.getVetorOrdenado().clone(), search, response);
                break;
            default:
                response = new ResponseSearch();
        }
        return response;
    }

    public static int[] criaVetor(Integer quantidade){
        int[] vetor;

        switch(quantidade){
            case 2:
                vetor = new int[1000];
                break;
            case 3:
                vetor = new int[5000];
                break;
            case 4:
                vetor = new int[10000];
                break;
            case 5:
                vetor = new int[50000];
                break;
            default:
                vetor = new int[100];
        }
        return vetor;
    }

    public static int[] criaLista(int[] vetor){
        TreeSet<Integer> lista = new TreeSet<>();
        int n, i = 0;
        // Gera uma lista sem números repetidos utilizando uma TreeSet
        do{
            n = (int) (Math.random() * 1000000);
            if(lista.add(n)){
                vetor[i] = n;
                i++;
            }
        }while(lista.size()<vetor.length);
        return vetor;
    }

}
