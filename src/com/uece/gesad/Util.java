package com.uece.gesad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Classe para métodos utilitários.
 * 
 * @author ericson
 *
 */
public class Util {

	/**
	 * Gera uma {@link ArrayList} de {@link Integer} aleatórios.
	 * 
	 * @param size Tamanho da minha {@link ArrayList}.
	 * @param seed Semente de randomização.
	 * @return {@link ArrayList} de números aleatórios.
	 */
	public static ArrayList<Integer> generateRandomList(int size, int seed) {
		Random random = new Random(seed);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			list.add(random.nextInt(size));
		}
		
		return list;
	}
	
	/**
	 * Gera uma lista de {@link Product}.
	 * @return Uma {@link List} de {@link Product}.
	 */
	public static List<Product> generateProductList() {
		List<Product> products = Arrays.asList(
				new Product("Arroz", 2, 2),
				new Product("Macarão", 3, 2),
				new Product("Fejão", 5, 2),
				new Product("Açucar", 3, 1),
				new Product("Sal", 1, 1)
		);
		return products;
	}
	
}
















