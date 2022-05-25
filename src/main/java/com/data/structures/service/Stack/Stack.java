package com.data.structures.service.Stack;

import com.data.structures.service.LinkedList.LinkedList;

public class Stack {
   private LinkedList<Integer> list = new LinkedList<>();

   public void add(int value){
      this.list.addFirst(value);
   }

   public void remove(){
      this.list.remove(this.get());
   }

   public Integer get(){
      return this.list.getPrimeiro().getValor();
   }
}
