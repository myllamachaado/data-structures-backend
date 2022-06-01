package com.data.structures.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class DataBusca {

    @NotBlank(message = "A quantidade de números é obrigatória")
    private Integer quantidade;

    @NotBlank(message = "O algoritmo de ordenação é obrigatório")
    private Integer algoritmo;

    @NotBlank(message = "O número buscado é obrigatório")
    private Integer numeroBuscado;

}
