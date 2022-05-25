package com.data.structures.utils;

import com.data.structures.model.Node;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Iterator<T> {
   private Node<T> node;

   public Iterator(Node<T> primeiro) {
   }

   public boolean hasNext(){
      if (node.getProximo() == null){
         return false;
      }
      else{
         return true;
      }
   }

   public Node<T> getNext(){
      node = node.getProximo();
      return node;
   }
}
