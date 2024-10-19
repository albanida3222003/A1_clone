package com.unu.proyectoweb.beans;

public class Autor {

	private int idAtor;
	private String nacionalidad;
	private String nombre;

	public int getIdAtor() {
		return idAtor;
	}

	public void setIdAtor(int idAtor) {
		this.idAtor = idAtor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor(int idAtor, String nacionalidad, String nombre) {
		super();
		this.idAtor = idAtor;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
	}

	public Autor() {
		super();
	}

}
