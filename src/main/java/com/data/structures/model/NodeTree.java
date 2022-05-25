package com.data.structures.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NodeTree<T> {

   private T valor;
   private NodeTree<T> esquerda;
   private NodeTree<T> direita;

   public NodeTree(T valor) {
      this.valor = valor;
      this.direita = null;
      this.esquerda = null;
   }
}
