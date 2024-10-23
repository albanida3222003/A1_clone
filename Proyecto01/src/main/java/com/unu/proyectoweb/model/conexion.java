package com.unu.proyectoweb.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	
	private String url = "jdbc:mysql://localhost:3306/bibliotecapoo2";
	private String usuario = "root";
	private String contraseña = "123456";
	protected Connection conexion;
	
	public void abrirConexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url,usuario,contraseña);
			System.out.println("La conexion a la base de datos fue exitosa");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
				System.out.println("Conexion cerrada");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.getSuppressed();
		}
	}

	
}
