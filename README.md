# Projeto de Lógica de Programação 💡👩‍💻 <img align="right" width="250" height="250" src="https://github.com/Susana-Bergamo/logica.programacao/blob/main/posts%20instagram%20pessoal%20(4).jpg">


Este projeto fornece uma explicação detalhada do código Java presente no projeto "Contar Letra A", que demosntra como contar a quantidade de letras "a" em uma frase. 
O código foi desenvolvido na IDE IntelleJ IDEA utilizando o framework Maven e está localizado no diretório ```src/main/java``` .


## 1. Estrutura do Código:

O código é composto por uma única classe pública chamada ```Frase```, que contém o método ```main``` onde a lógica principal é implementada.

## 2. Variáveis:

* ```frase```: String que armazena a frase a ser analisada.
* ```letra```: Char que define a letra que será contada (neste caso, 'a').
* ```contarLetra```: Inteiro que armazena a contagem final de letras "a".

 ## 3. Lógica Principal:

* Remoção de Caracteres Especiais: A primeira etapa consiste em remover caracteres especiais da frase utilizando a expressão regular ```[^a-zA-z]```. Essa expressão remove tudo que não seja letra maiúscula ou minúscula.

* Laço ```fo```r: Um laço ```for``` é utilizado para percorrer cada caractere da frase.

* Comparação de Caracteres: Dentro do laço ```for```, o caractere atual da frase é comparado com a letra 'a' usando o operador ```==```.

* Incrementação da Contagem: Se o caractere atual for igual a 'a', a variável ```contarLetra``` é incrementada em 1.

## 4. Exibição do Resultado:

Após a contagem ser realizada, o valor final de ```contarLetra``` é exibido no console utilizando a função ```System.out.println```.

## 5. Exemplo de Uso:

A frase utilizada no código como exemplo é: ***"Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU."***. 
*Essa frase possui 7 letras "a".*

## ✅Considerações Finais:

Este código é um exemplo simples que demonstra como contar a quantidade de letras "a" em uma frase. Através da compreensão deste código, você pode adaptá-lo para realizar outras tarefas de contagem e análise de strings em Java.
O objetivo de criação deste projeto veio através de um desafio da [E2E Coders](https://ead.e2etreinamentos.com.br/), no qual faço parte. 
