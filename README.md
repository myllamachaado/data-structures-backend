# Estruturas de dados em Java/Spring Boot

![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) 
![image](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white) 


Esse projeto contém o back-end das implementações das estruturas:

- [x] Bubble Sort
- [x] Insertion Sort
- [x] Selection Sort
- [x] Shell Sort
- [x] Heap Sort (Recursivo)
- [x] Quick Sort (Recursivo)

<br />

- [x] Linked List
- [x] Queue
- [x] Stack
<br />

Os itens: 
- [ ] Busca Linear
- [ ] Busca Binária
- [ ] Árvore Binária
<br />

- [ ] Heap Sort (Iterativo)
- [ ] Quick Sort (Iterativo)
</br>

- [ ] Grafo
- [ ] BFS
- [ ] DFS

Também serão adicionadas no futuro.

Para executar o back-end do projeto na sua máquina, digite o seguinte comando:
```
mvn spring-boot:run 
```

O endereço base das requisições é:
```
http://localhost:8080/ 
```

Caso o código seja rodado epnas pelo back-end é necessário enviar no body da requisição o seguinte json:

```
{
    "quantidade" : string,
    "algoritmo" : string
}
```

Os valores aceitos para o campo "quantidade" são:
```
"quantidade" : "1" - 100 números
"quantidade" : "2" - 1000 números
"quantidade" : "3" - 5000 números
"quantidade" : "4" - 10000 números
"quantidade" : "5" - 50000 números
```

Os valores aceitos para o campo "algoritmo" são:
```
"algoritmo" : "1" - Bubble Sort
"algoritmo" : "2" - Insertion Sort
"algoritmo" : "3" - Selection Sort
"algoritmo" : "4" - Recursive Heap Sort
"algoritmo" : "5" - Recursive Quick Sort
"algoritmo" : "6" - Comparativo entre todos os algoritmos
```

O front-end desenvolvido em Angular para este projeto está [disponível neste repositório](https://github.com/myllamachaado/data-structures-frontend).
