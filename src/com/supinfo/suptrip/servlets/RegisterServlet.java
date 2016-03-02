package com.supinfo.suptrip.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import com.supinfo.suptrip.dao.UsersDao;
import com.supinfo.suptrip.dao.jpa.JpaCampusDao;
import com.supinfo.suptrip.dao.jpa.JpaUsersDao;
import com.supinfo.suptrip.manager.PersistanceManager;
import com.supinfo.suptrip.models.*;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/jsp/register")
public class RegisterServlet extends HttpServlet {
	   private static SessionFactory factory; 

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JpaCampusDao jpacampus = new JpaCampusDao(PersistanceManager.getEntityManagerFactory());
		
		request.setAttribute("campus", jpacampus.getAllCampus());
						
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/register.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		JpaUsersDao jpaUser = new JpaUsersDao(PersistanceManager.getEntityManagerFactory());
		
		String id = request.getParameter("idbooster");
		String email = request.getParameter("email");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String campus = request.getParameter("campus");
		
		Users user = new Users();
		user.setEmailAdress(email);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setIdbooster(id);
		user.setPassword(password);
		user.setCampus(campus);
		
		jpaUser.addUser(user);
		

		RequestDispatcher rd = request.getRequestDispatcher("/");
		rd.forward(request, response);
	}

}
