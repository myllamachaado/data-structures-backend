package com.data.structures.controllers;

import com.data.structures.model.Data;
import com.data.structures.model.response.ResponseSort;
import com.data.structures.service.OrdenacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class IndexController {

   OrdenacaoService ordenacaoService;

   public IndexController(OrdenacaoService ordenacaoService) {
      this.ordenacaoService = ordenacaoService;
   }

   @PostMapping("")
   public ResponseEntity<ResponseSort> executar(@Valid @RequestBody Data data){
      return ResponseEntity.ok(ordenacaoService.ordenacao(data));
   }

}
