package com.data.structures.service.LinkedList;

import com.data.structures.model.Node;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LinkedList<T> {
   private Node<T> primeiro;
   private Node<T> ultimo;
   private int tamanho;

   public LinkedList() {
      this.tamanho = 0;
   }

   public void add(T value){
      Node<T> node = new Node<T>(value);
      if(this.primeiro == null && this.ultimo == null){
         this.primeiro = node;
         this.ultimo = node;
      }
      else{
         this.ultimo.setProximo(node);
         this.ultimo = node;
      }
      this.tamanho++;
   }

   public void addFirst(T value){
      Node<T> node = new Node<T>(value);
      if(this.primeiro == null && this.ultimo == null){
         this.primeiro = node;
         this.ultimo = node;
      }
      else{
         node.setProximo(this.primeiro);
         this.primeiro = node;
      }
      this.tamanho++;
   }

   public void remove(T search) {
      Node<T> atual = this.primeiro;
      Node<T> anterior = null;
      for (int i = 0; i < this.getTamanho(); i++) {
         if (atual.getValor().equals(search)) {
            if (this.tamanho == 1) {
               this.primeiro = null;
               this.ultimo = null;
            } else if (atual == primeiro) {
               this.primeiro = atual.getProximo();
               atual.setProximo(null);
            } else if (atual == ultimo) {
               this.ultimo = anterior;
               anterior.setProximo(null);
            } else {
               anterior.setProximo(atual.getProximo());
               atual = null;
            }
            this.tamanho--;
            break;
         }
         anterior = atual;
         atual = atual.getProximo();
      }
   }

   public Node<T> get(int pos){
      Node atual = this.primeiro;
      for(int i = 0; i < pos; i++){
         if(atual.getProximo() != null){
            atual = atual.getProximo();
         }
      }
      return atual;
   }

//   public Iterator<T> getIterator(){
//      return new Iterator<T>(this.primeiro);
//   }

}
