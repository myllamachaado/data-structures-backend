package com.data.structures.service.Queue;

import com.data.structures.service.LinkedList.LinkedList;

public class Queue {
   private LinkedList<Integer> list = new LinkedList<>();

   public void add(int value){
      this.list.add(value);
   }

   public void remove(){
      this.list.remove(this.get());
   }

   public Integer get(){
      return this.list.getPrimeiro().getValor();
   }

}
