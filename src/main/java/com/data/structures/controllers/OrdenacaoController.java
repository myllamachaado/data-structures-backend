package com.data.structures.controllers;

import com.data.structures.model.DataOrdenacao;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.OrdenacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ordenacao")
public class OrdenacaoController {

   OrdenacaoService ordenacaoService;

   public OrdenacaoController(OrdenacaoService ordenacaoService) {
      this.ordenacaoService = ordenacaoService;
   }

   @PostMapping("")
   public ResponseEntity<ResponseSort> executar(@RequestBody DataOrdenacao dataOrdenacao){
      return ResponseEntity.ok(ordenacaoService.ordenacao(dataOrdenacao));
   }

}
