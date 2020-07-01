package com.Equipe.Dynamite.virtual.market.Dtos;

import com.Equipe.Dynamite.virtual.market.entities.Product;

public class ProductDto {

	private int id, stock;
	
	private String name, description;
	
	private double price;

	public ProductDto(int id, int stock, String name, String description, double price) {
		super();
		this.id = id;
		this.stock = stock;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public ProductDto(Product product) {
		this.id=product.getId();
		this.stock=product.getStock();
		this.name=product.getName();
		this.description=product.getDescription();
		this.price=product.getPrice();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
