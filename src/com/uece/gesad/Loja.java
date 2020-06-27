package com.uece.gesad;

import java.util.List;

public class Loja {

	public static void main(String[] args) {

		List<Product> products = Util.generateProductList();

		// imprimindo normalmente.
		products.forEach(System.out::println);

		System.out.println("Valor total da compra: " + getPriceOfTotal(products, 15));

		System.out.println(products.stream().map(Product::getName).reduce("Produtos: ", (a, b) -> a + ", " + b));

	}

	/**
	 * Gerar o valor total de uma compra. Onde essa contra é uma lista de
	 * {@link Product} mais um valor de frete.
	 * 
	 * @param products {@link List} de {@link Product}.
	 * @param frete    Valor do frete.
	 * @return
	 */
	public static double getPriceOfTotal(List<Product> products, double frete) {
		// Mapeando a lista de produtos em uma lista de Doubles. Depois, estou reduzindo
		// essa lista em um valor double que final é somatório de tudo
		// mais o valor do frete.
		double total = products.stream().mapToDouble(product -> product.getPrice() * product.getQuant()).reduce(frete,
				(a, b) -> a + b);

		return total;
	}

}
