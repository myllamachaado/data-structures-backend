package com.data.structures.service.BinaryTree;

import com.data.structures.model.NodeTree;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecursiveBinaryTree<T extends Comparable> {

   private NodeTree<T> raiz;
   private NodeTree<T> atual;
   private NodeTree<T> paiAtual;
   private NodeTree<T> substituto;
   private NodeTree<T> paiSubstituto;

   public RecursiveBinaryTree() {
      this.raiz = null;
   }

   public void add(T valor){
      NodeTree<T> novoElemento = new NodeTree<>(valor);
      if(raiz == null){
         this.raiz = novoElemento;
      }
      else{
         NodeTree<T> atual = this.raiz;
         while(true){
            if(novoElemento.getValor().compareTo(atual.getValor()) == -1) {
               if(atual.getEsquerda() != null){
                  atual = atual.getEsquerda();

               } else {
                  atual.setEsquerda(novoElemento);
                  break;
               }
            } else {
               if(atual.getDireita() != null){
                  atual = atual.getDireita();

               } else {
                  atual.setDireita(novoElemento);
                  break;
               }
            }
         }
      }
   }

   public boolean remove(T valor){
      this.atual = this.raiz;
      this.paiAtual = null;

      find(valor);

      if(this.atual != null){
         if (this.atual.getDireita() != null){
            this.temFilhoADireita();
         } else if (this.atual.getEsquerda() != null){
            this.temFilhoAEsquerda();
         } else {
            this.naoTemFilhos();
         }
         return true;
      } else {
         return false;
      }
   }

   public void find(T valor){
      while(this.atual != null){
         if(this.atual.getValor().equals(valor)){
            break;
         } else if ((valor.compareTo(this.atual.getValor())) == -1) {
            this.paiAtual = atual;
            this.atual = this.atual.getEsquerda();

         } else {
            this.paiAtual = this.atual;
            this.atual = this.atual.getDireita();
         }
      }
   }

   public void temFilhoADireita(){
      this.substituto = atual.getDireita();
      this.paiSubstituto = atual;

      buscaEsquerda();

      if (this.paiAtual != null){
         this.substituto.setEsquerda(this.atual.getEsquerda());
         this.substituiNo();
      } else {
         this.substituto.setEsquerda(this.atual.getEsquerda());
         this.substituto.setDireita(this.atual.getDireita());
         this.raiz = this.substituto;
      }
      this.apagarNo();
   }

   public void temFilhoAEsquerda(){
      this.substituto = this.atual.getEsquerda();
      this.paiSubstituto = this.atual;

      this.buscaDireita();

      if(this.paiAtual != null){
         this.substituiNo();
      } else {
         this.raiz = this.substituto;
      }
      this.apagarNo();
   }

   public void naoTemFilhos(){
      if(this.paiAtual != null) {
         if(this.atual.getValor().compareTo(this.paiAtual.getValor()) == -1){
            this.paiAtual.setEsquerda(null);
         } else {
            this.paiAtual.setDireita(null);
         }
      } else {
         this.raiz = null;
      }
   }

   public void buscaDireita(){
      while(this.substituto.getDireita() != null){
         this.paiSubstituto = this.substituto;
         this.substituto = this.substituto.getDireita();
      }
   }

   public void buscaEsquerda(){
      while(this.substituto.getEsquerda() != null){
         this.paiSubstituto = this.substituto;
         this.substituto = this.substituto.getEsquerda();
      }
   }

   public void substituiNo(){
      if(this.atual.getValor().compareTo(this.paiAtual.getValor()) == -1){
         this.atual.setEsquerda(this.substituto);
      } else {
         this.atual.setDireita(this.substituto);
      }
   }

   public void apagarNo(){
      if(this.substituto.getValor().compareTo(this.paiSubstituto.getValor()) == -1){
         this.paiSubstituto.setEsquerda(null);
      } else {
         this.paiSubstituto.setDireita(null);
      }
   }

   public void emOrdem(NodeTree<T> atual){
      if(atual != null){
         emOrdem(atual.getEsquerda());
         System.out.println(atual.getValor());
         emOrdem(atual.getDireita());
      }
   }

   public void preOrdem(NodeTree<T> atual){
      if(atual != null){
         System.out.println(atual.getValor());
         preOrdem(atual.getEsquerda());
         preOrdem(atual.getDireita());
      }
   }

   public void posOrdem(NodeTree<T> atual){
      if(atual != null){
         posOrdem(atual.getEsquerda());
         posOrdem(atual.getDireita());
         System.out.println(atual.getValor());
      }
   }
}
