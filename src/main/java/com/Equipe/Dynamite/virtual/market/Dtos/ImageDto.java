package com.Equipe.Dynamite.virtual.market.Dtos;

import com.Equipe.Dynamite.virtual.market.entities.Image;
import com.Equipe.Dynamite.virtual.market.entities.Product;

public class ImageDto {

	private int id;
	
	private Product product;
	
	private Byte[] image;

	public ImageDto(int id, Product product, Byte[] image) {
		super();
		this.id = id;
		this.product = product;
		this.image = image;
	}
	public ImageDto(Image image) {
		this.id=image.getId();
		this.image=image.getImage();
		this.product=image.getProduct();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}
	
}
