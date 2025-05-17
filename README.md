# Princípios De Projeto

Este repositório contém exemplos de código que ilustram quatro princípios importantes de projeto de software. Cada exemplo está documentado com explicações do que é o princípio, para que serve, e como o código implementado demonstra sua importância na prática.

-> Todos os códigos foram desenvolvidos na linguagem Java, os códigos apresentados foram retirados de um trabalho antigo, exceto pelo exemplo do Princípio Aberto-Fechado, e foram colocadas apenas as partes relativas aos princípios para explicação.

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

Por Exemplo, vamos supor que tenhamos essa lista de strings a seguir, mas que eu desejo alterar a forma de ordenar dela, ao invés de ordenar alfabeticamente, eu queira ordenar pelo tamanho da palavra.
>List<String> nomes;\
>nomes = Arrays.asList("joao", "maria", "alexandre", "ze");\
>Collections.sort(nomes);
>
>System.out.println(nomes);\
>// resultado: ["alexandre","joao","maria","ze"]

Então para resolver este problema é preciso utilizar de um comparador para ver o tamanho das letras da seguinte forma: 
>Comparator<String> comparador = new Comparator<String>() {\
>  public int compare(String s1, String s2) {\
>    return s1.length() - s2.length();\
>  }\
>};\
>Collections.sort(nomes, comparador);\
>System.out.println(nomes);\
>// resultado: [ze, joao, maria, alexandre]\

Dessa forma, apesar do método .sort da classe Colections não ser modificado o seu próprio método, é possível perceber que eles está aberto a modificações já que foi possível estender para a forma que fosse desejado de ordenação da lista de strings.

## 3. L — Liskov Substitution Principle (Princípio da substituição de Liskov)

### O que é?
->  Para todos os métodos herdados das subclasses de uma classe pai, devem realizar as mesmas tarefas que o método original, quando substituidas.

### Para que serve?
-> Serve para o código ficar mais extensível. Além de garantir a segurança nas relações de heranças, reuso de código e evitando a quebra de contratos entre superclasses e subclasses.

### Exemplo e explicação

[Link do Exemplo](Code_PrincipiosProjetos/src/Entidade/FilmeInfantil.java)

Aqui foi suposto que uma classe nova chamada Filme Infantil, fosse criada herdando atributos da classe Filme. 
>Filme filme = new FilmeInfantil(1, "Divertidamente", "Livre");\
>System.out.println(filme.getNome_filme());
 
Se na Main fosse manipulado a criação de um objeto novo filme como descrito no código acima, mas fosse usado o construtor do Filme Infantil, ao tentarmos imprimir o titulo do filme, ou seja, o seu nome, ainda sim o código funcionaria corretamente, assim seguindo o princípio de Liskov que permite a substituição da clase pai por uma das subclasses herdadas.

## 4. Princípio de Demeter

### O que é?
-> Também conhecido como Princípio do Mínimo Conhecimento, afirma que um objeto não deve acessar objetos internos de outro objeto, evitando longas "cadeias" de chamadas de métodos.

### Para que serve?
-> Reduz o acoplamento e torna o sistema mais modular, além de garantir que o encapsulamento funcione de forma correta, já que essas longas cadeias, quebravam ele. Assim servindo para ocultar a informação que não seja necessária para o funcionamento daquele método ou função.

### Exemplo e explicação

[Link do Exemplo](https://github.com/luizabasseto/PrincipiosDeProjeto/blob/db22c93923aafc0631dd38b0716ce5b6ada954c7/Code_PrincipiosProjetos/src/Entidade/Cinema.java#L22-L24)

-> Aqui segue o crud de filme, agora com o crud do cinema, em que é necessário imprimir os filmes que estão em cartaz no cinema. E para isso foi criado direto o método PrintFilmeEmCartaz, que acessa diretamente o filme em cartaz da classe Cinema pelo método getFilmeEmCartaz() sem precisar chamar outros métodos, para acessar a classe cinema e em seguida acessar a classe Filme para aí então consegui o nome do filme.
