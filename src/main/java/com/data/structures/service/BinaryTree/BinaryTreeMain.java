package com.data.structures.service.BinaryTree;

public class BinaryTreeMain {

   public static void main(String[] args) {
      RecursiveBinaryTree<Integer> tree = new RecursiveBinaryTree();

      tree.add(10);
      tree.add(8);
      tree.add(5);
      tree.add(9);
      tree.add(7);
      tree.add(18);
      tree.add(13);
      tree.add(20);

      tree.emOrdem(tree.getRaiz());

//      System.out.println("Item: 10");
//      tree.remove(10);
//      System.out.println("Item: 20");
//      tree.remove(20);
//      System.out.println("Item: 9");
//      tree.remove(9);
//
//      System.out.println("\nEm Ordem: ");
//      tree.emOrdem(tree.getRaiz());

   }

}
