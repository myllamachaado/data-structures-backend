package com.data.structures.service.LinkedList;

public class LinkedListMain {

   public static void main(String[] args) {

      LinkedList<String> list = new LinkedList<>();
      list.add("SM");
      list.add("JYP");
      list.add("YG");
      System.out.println("Primeiro: " + list.getPrimeiro().getValor());
      System.out.println("Ultimo: " + list.getUltimo().getValor());

      System.out.println("Valor 1: " + list.get(1).getValor());

   }


}
