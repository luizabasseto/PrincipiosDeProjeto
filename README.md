# PrincipiosDeProjeto

Este repositório contém exemplos de código que ilustram quatro princípios importantes de projeto de software. Cada exemplo está documentado com explicações do que é o princípio, para que serve, e como o código implementado demonstra sua importância na prática.

-> Todos os códigos serão desenvolvidos na linguagem Java

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

->

#### Problema resolvido

-> 

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



#### Problema resolvido



## 4. Princípio de Demeter

### O que é?
-> Também conhecido como Princípio do Mínimo Conhecimento, afirma que um objeto não deve acessar objetos internos de outro objeto, evitando longas "cadeias" de chamadas de métodos.

### Para que serve?
-> Reduz o acoplamento e torna o sistema mais modular, além de garantir que o encapsulamento funcione de forma correta, já que essas longas cadeias, quebravam ele. Assim servindo para ocultar a informação que não seja necessária para o funcionamento daquele método ou função.

### Exemplo e explicação
