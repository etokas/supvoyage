package com.supinfo.suptrip.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.suptrip.dao.jpa.JpaUsersDao;
import com.supinfo.suptrip.manager.PersistanceManager;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/jsp/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idbooster = (String) request.getParameter("idbooster");
		String password = (String) request.getParameter("password");
		String message;
		
		JpaUsersDao jpauser =  new JpaUsersDao(PersistanceManager.getEntityManagerFactory());
		
		boolean verif = jpauser.login(idbooster, password);
		System.out.println(verif);
		
		if(verif == true){
			request.getSession().setAttribute("idBoosterSession", idbooster);
			response.sendRedirect(request.getContextPath() + "/");
		}else {
			
			message = "Identification incorrect";
			request.setAttribute("error", message);
			this.doGet(request, response);
		}
	}

}
