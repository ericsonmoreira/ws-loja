# GESAD market

Vamos usar uma classe Produto para simular compras em uma loja.

## Conteúdo

- [X] Sobre o que vamos falar?
- [x] O que é um Stream?
- [x] Qual a importância disso?

## Aprender a usar

- [x] `forEach` - Como usamos e como poderiamos estar usando.
- [x] `filter` - como selecionar apenas aquilo que queremos.
- [x] `map` - se já temos o forEach, por que motivo usar o map?
- [x] `sorted` - ordenar números eu sei, mas como ordenar uma lista de Produtos?
- [x] `reduce` - reduzindo elementos em um.

## Extra

- [x] Como mostrar um valor monetário no Java.
- [x] Alguns atalhos do eclipse para nos ajudar.
- [x] Trabalhar com números randômicos no Java.

## Atalhos

- __Ctrl + Shift + F__ = Formatação do código.
- __Ctrl + Shift + O__ = Organizar as importaçãoes (imports).
- __Ctrl + 3__ = Find Actions (atalho para buscar funcinalidades. Ex.: "ggas" faz o "generate geters and seters").

## Códigos aprendidos

Código de maneitas variadas de se usar o forEach:

``` java
// for tradiconal
for (int i = 0; i < list.size(); i++) {
 System.out.println(list.get(i));
}

// forEach básico
for (Integer elem : list) {
 System.out.println(elem);
}

// forEach usando arrow function
list.forEach(elem -> System.out.println(elem));

// forEach usnado funções lambda
list.forEach(System.out::println);

```

Código para usar filter com uma lista de Integers:

``` java
List<Integer> integers = Util.generateRandomList(100, 0);

// quero filtrar todos os números menores que 50.
List<Integer> aux = integers.stream().filter(elem -> elem < 10).collect(Collectors.toList());

aux.forEach(elem -> System.out.println(elem));
```

Como filtar um "Produto":

``` java
// filtrando todos so produtos que tem preço maior ou igal a R$ 3,00 e
// impriminto eles.
products.stream().filter(product -> product.getPrice() >= 3 && product.getPrice() < 5).forEach(product -> System.out.println(product));

```

Gerando um map de números ao quadrado:

``` java
List<Integer> integers = Util.generateRandomList(100, 0);

// com lista de números, quero gerar a lista daqueles números ao quadrado.

integers.stream().filter(elem -> elem < 50).mapToDouble(elem -> Math.pow(elem, 2)).forEach(elem -> System.out.println(elem));

```

Usando o Sorted:

``` java
List<Product> products = Util.generateProductList();

// imprimindo normalmente.
products.forEach(System.out::println);

// imprimindo em ordem crescente pelo nome do produto.
products.stream().sorted(Comparator.comparing(Product::getName, Comparator.reverseOrder())).forEach(System.out::println);
```

## Exercícios Propostos

1. Crie uma classe que represente uma conta bancária. Toda conta possui um titular, um número e um saldo. Crie um método para depositar um valor e outro para realizar um saque (lembre que saldo não pode ser negativo).

2. Crie um classe Banco que tem um lista de Contas.

3. Crie um método da classe Banco que retorna o total de saldos que esse banco tem (usando Stream).

4. Crie um metodos classe Banco que retorna o uma Lista de Contas ordadenas por:

- Valor do saldo.
- Nome do tilular.
- numero da conta em ordem decrescente.
