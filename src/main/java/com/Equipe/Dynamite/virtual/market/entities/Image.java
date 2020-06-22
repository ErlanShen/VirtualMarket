package com.Equipe.Dynamite.virtual.market.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(optional = false,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Product product;
	
	@Lob
		private Byte[] image;

	public Image() {

	}

	public Image(int id, Product product, Byte[] image) {
		super();
		this.id = id;
		this.product = product;
		this.image = image;
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
