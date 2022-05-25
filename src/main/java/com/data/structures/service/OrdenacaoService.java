package com.data.structures.service;

import com.data.structures.model.Data;
import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.BubbleSort.BubbleSort;
import com.data.structures.service.HeapSort.RecursiveHeapSort;
import com.data.structures.service.InsertionSort.InsertionSort;
import com.data.structures.service.QuickSort.RecursiveQuickSort;
import com.data.structures.service.SelectionSort.SelectionSort;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdenacaoService {

    public ResponseSort ordenacao(@Valid Data data){

        ResponseSort response = new ResponseSort();
        List<ResponseResults> result = new ArrayList<>();

        String quantidade = data.getQuantidade();
        String algoritmo = data.getAlgoritmo();

        // Cria as posições do vetor
        int[] vetor = criaVetor(quantidade);
        // Insere os valores aleatórios no vetor
        vetor = criaLista(vetor, algoritmo);

        switch(algoritmo){
            case "1":
                result.add(new BubbleSort().ordenar(vetor.clone(), response));
                response.setEstatisticas(result);
                break;
            case "2":
                result.add(new InsertionSort().ordenar(vetor.clone(), response));
                response.setEstatisticas(result);
                break;
            case "3":
                result.add(new SelectionSort().ordenar(vetor.clone(), response));
                response.setEstatisticas(result);
                break;
            case "4":
                result.add(new RecursiveHeapSort().ordenar(vetor.clone(), response));
                response.setEstatisticas(result);
                break;
            case "5":
                result.add(new RecursiveQuickSort().ordenar(vetor.clone(), response));
                response.setEstatisticas(result);
                break;
            case "6":
                result.add(new BubbleSort().ordenar(vetor.clone(), response));
                result.add(new InsertionSort().ordenar(vetor.clone(), response));
                result.add(new SelectionSort().ordenar(vetor.clone(), response));
                result.add(new RecursiveHeapSort().ordenar(vetor.clone(), response));
                result.add(new RecursiveQuickSort().ordenar(vetor.clone(), response));
                response.setEstatisticas(result);
                break;
            default:
                response = new ResponseSort();
        }
        // Guarda o vetor original desordenado
        response.setVetor(vetor);
        return response;
    }

    public int[] criaVetor(String quantidade){
        int[] vetor;

        switch(quantidade){
            case "2":
                vetor = new int[1000];
                break;
            case "3":
                vetor = new int[5000];
                break;
            case "4":
                vetor = new int[10000];
                break;
            case "5":
                vetor = new int[50000];
                break;
            default:
                vetor = new int[100];
        }
        return vetor;
    }

    public int[] criaLista(int[] vetor, String algoritmo){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 1000);
        }
        return vetor;
    }

}
