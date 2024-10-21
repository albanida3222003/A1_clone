package com.unu.proyectoweb.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;

import com.unu.proyectoweb.beans.Autor;
import com.unu.proyectoweb.model.AutoresModel;

/**
 * Servlet implementation class AutoresContoler
 */
public class AutoresContoler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutoresModel modelo = new AutoresModel();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutoresContoler() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("op") == null) {
			// listar
			listar(request, response);
			return;
		}
		String operacion = request.getParameter("op");
		switch (operacion) {

		case "listar":
			// listar
			listar(request, response);
			break;
		case "nuevo":
			// nuevo
			break;
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaAutores", modelo.listarAutores());
		Iterator<Autor> it = modelo.listarAutores().iterator();
		while(it.hasNext()) {
			Autor a = it.next();
			System.out.println(a.getIdAtor() + " " + a.getNacionalidad() + " " + a.getNombre());
		}
		request.getRequestDispatcher("/autores/listaAutores.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
