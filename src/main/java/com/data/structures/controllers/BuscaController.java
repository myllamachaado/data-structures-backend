package com.data.structures.controllers;


import com.data.structures.model.DataBusca;
import com.data.structures.model.response.ResponseSearch;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.BuscaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/busca")
public class BuscaController {

    private final BuscaService buscaService;

    public BuscaController(BuscaService buscaService) {
        this.buscaService = buscaService;
    }

    @PostMapping("")
    public ResponseEntity<ResponseSearch> executar(@RequestBody DataBusca data){
        return ResponseEntity.ok(buscaService.busca(data));
    }

}
