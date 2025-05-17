# Princípios De Projeto

Este repositório contém exemplos de código que ilustram quatro princípios importantes de projeto de software. Cada exemplo está documentado com explicações do que é o princípio, para que serve, e como o código implementado demonstra sua importância na prática.

-> Todos os códigos serão desenvolvidos na linguagem Java, os códigos apresentados foram retirados de um trabalhoa antigo, e foram colocadas apenas as partes relativas aos princípios para explicação.

## Princípios Escolhidos

1. S — Single Responsiblity Principle (Princípio da responsabilidade única)
2. O — Open-Closed Principle (Princípio Aberto-Fechado)
3. L — Liskov Substitution Principle (Princípio da substituição de Liskov)
4. Demeter 

## 1.  S — Single Responsiblity Principle (Princípio da responsabilidade única)
### O que é? 
-> O principio de responsabilidade única afirma que uma classe ou função deve ter apenas uma única responsabilidade, ou seja, ela deve ser responsável por uma única parte de uma funcionalidade do sistema e deve existir um único motivo para modificar uma classe.
### Para que serve?
-> Este princípio serve para o código ser coeso e facilitar a manutenção já que mudanças em uma responsabilidade não afetam outras.

### Exemplo e explicação

->[Link do Exemplo](https://github.com/luizabasseto/PrincipiosDeProjeto/blob/8fcf3a53daa25d052552afe0c9c103eaa6a2137d/Code_PrincipiosProjetos/src/Controle/ControleFilme.java#L23C5-L26C1)

O problema aqui se tratava de um crud básico de filmes, e como todo crud é preciso adicionar na lista um valor, por isso na package de Controle, há o método adicionar que faz sua única função de adicionar um valor de filme  a lista de filmes. Seguindo o princípio de responsabilidade única.

## 2. O — Open-Closed Principle (Princípio Aberto-Fechado)

### O que é?
-> Uma classe deve estar fechada para modificações, mas aberta para extensões.

### Para que serve?
-> Permite que o sistema seja estendido com novas funcionalidades sem alterar o código existente, prevenindo estragar a a funcionalidade principal.

### Exemplo e explicação

-> 

#### Problema resolvido



## 3. L — Liskov Substitution Principle (Princípio da substituição de Liskov)

### O que é?
->  Para todos os métodos herdados das subclasses de uma classe pai, devem realizar as mesmas tarefas que o método original, quando substituidas.

### Para que serve?
-> Serve para o código ficar mais extensível. Além de garantir a segurança nas relações de heranças, reuso de código e evitando a quebra de contratos entre superclasses e subclasses.

### Exemplo e explicação



## 4. Princípio de Demeter

### O que é?
-> Também conhecido como Princípio do Mínimo Conhecimento, afirma que um objeto não deve acessar objetos internos de outro objeto, evitando longas "cadeias" de chamadas de métodos.

### Para que serve?
-> Reduz o acoplamento e torna o sistema mais modular, além de garantir que o encapsulamento funcione de forma correta, já que essas longas cadeias, quebravam ele. Assim servindo para ocultar a informação que não seja necessária para o funcionamento daquele método ou função.

### Exemplo e explicação

[Link para o Código de Exemplo](https://github.com/luizabasseto/PrincipiosDeProjeto/blob/db22c93923aafc0631dd38b0716ce5b6ada954c7/Code_PrincipiosProjetos/src/Entidade/Cinema.java#L22-L24)

-> Aqui segue o crud de filme, agora com o crud do cinema, em que é necessário imprimir os filmes que estão em cartaz no cinema. E para isso foi criado direto o método PrintFilmeEmCartaz, que acessa diretamente o filme em cartaz da classe Cinema pelo método getFilmeEmCartaz() sem precisar chamar outros métodos, para acessar a classe cinema e em seguida acessar a classe Filme para aí então consegui o nome do filme.
