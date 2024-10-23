package com.unu.proyectoweb.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.unu.proyectoweb.beans.*;

public class AutoresModel extends conexion{
	
	CallableStatement cs;
	ResultSet rs;
	
	public List<Autor> listarAutores() throws SQLException{
		try {
			ArrayList<Autor> lista = new ArrayList<Autor>();
			String sql = "CALL sp_listarAutores()";
			this.abrirConexion();
			
			cs = conexion.prepareCall(sql);
			rs = cs.executeQuery();
			while(rs.next()) {
				Autor autor = new Autor();
				autor.setIdAtor(rs.getInt("idautor"));
				autor.setNombre(rs.getString("nombre"));
				autor.setNacionalidad(rs.getString("nacionalidad"));
				lista.add(autor);
			}
			this.cerrarConexion();
			return lista;
		}catch (Exception e) {
			// TODO: handle exception
			this.cerrarConexion();
			return null;
		}
		
	}
	
	/*
	public List<Autor> listarAutores(){
		ArrayList<Autor> autores = new ArrayList<Autor>();
		autores.add(new Autor(1, "Pepe", "Lucho"));
		autores.add(new Autor(2, "Luis", "Rios"));
		autores.add(new Autor(3, "Lupe", "Bartra"));
		autores.add(new Autor(4, "Olga", "Moreno"));
		autores.add(new Autor(5, "Leni", "Schurt"));
		return autores;
	}
	*/
}
