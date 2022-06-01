package com.data.structures.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class DataOrdenacao {

   @Size(max = 7, min = 1)
   @NotBlank(message = "A quantidade de números é obrigatória")
   private Integer quantidade;

   @Size(max = 7, min = 1)
   @NotBlank(message = "O algoritmo de ordenação é obrigatório")
   private Integer algoritmo;

}
