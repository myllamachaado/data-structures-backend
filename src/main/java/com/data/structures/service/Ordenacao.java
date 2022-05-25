package com.data.structures.service;

import com.data.structures.model.response.ResponseResults;
import com.data.structures.model.response.ResponseSort;

public interface Ordenacao {

    public ResponseResults ordenar(int[] vetor, ResponseSort res);

}
