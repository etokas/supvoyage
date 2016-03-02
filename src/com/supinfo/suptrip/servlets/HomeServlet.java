package com.supinfo.suptrip.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.suptrip.dao.jpa.JpaCampusDao;
import com.supinfo.suptrip.dao.jpa.JpaTripDao;
import com.supinfo.suptrip.manager.PersistanceManager;
import com.supinfo.suptrip.models.Campus;
import com.supinfo.suptrip.models.Trip;

import antlr.collections.List;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JpaCampusDao jpacampus = new  JpaCampusDao(PersistanceManager.getEntityManagerFactory());
		JpaTripDao jpatrip = new JpaTripDao(PersistanceManager.getEntityManagerFactory());
		
		
		request.setAttribute("trip", jpatrip.getAllTripListByCampusName());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
