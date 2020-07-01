package com.Equipe.Dynamite.virtual.market.Dtos;

import com.Equipe.Dynamite.virtual.market.entities.Categorie;

public class CategorieDto {

	private int id;

	private String nombre;

	public CategorieDto(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public CategorieDto(Categorie categorie) {
		this.id=categorie.getId();
		this.nombre=categorie.getNombre();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
