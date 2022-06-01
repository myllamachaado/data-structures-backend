package com.data.structures.service;

import com.data.structures.model.response.ResponseSearch;

public interface Busca {

    public ResponseSearch buscar(int[] vetor, int search, ResponseSearch res);

}
