package com.uece.gesad;

import java.text.NumberFormat;

/**
 * Classe para representar um Produto de uma loja.
 * 
 * @author ericson
 *
 */
public class Product {

	private String name;
	private double price;
	private int quant;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	/**
	 * Contrutor padrão.
	 * 
	 * @param name  nome do produto.
	 * @param price preço do produto.
	 * @param quant quantidade do produto.
	 */
	public Product(String name, double price, int quant) {
		super();
		this.name = name;
		this.price = price;
		this.quant = quant;
	}

	@Override
	public String toString() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		return "Product [name=" + name + ", price=" + numberFormat.format(price) + ", quant=" + quant + "]";
	}

}
