package com.unu.proyectoweb.utiler;

import com.unu.proyectoweb.model.conexion;

public class prueba {

	public static void main(String[] args) {
		conexion con = new conexion();
		con.abrirConexion();
		con.cerrarConexion();
	}

}
