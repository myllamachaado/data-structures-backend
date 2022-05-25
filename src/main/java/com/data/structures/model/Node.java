package com.data.structures.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
   private T valor;
   private Node<T> proximo;

   public Node(T valor) {
      this.valor = valor;
   }
}
