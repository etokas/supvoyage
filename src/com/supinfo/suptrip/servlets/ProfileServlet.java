package com.supinfo.suptrip.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.suptrip.dao.jpa.JpaCampusDao;
import com.supinfo.suptrip.dao.jpa.JpaUsersDao;
import com.supinfo.suptrip.manager.PersistanceManager;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/jsp/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idBooster = (String) request.getSession().getAttribute("idBoosterSession");
		
		JpaUsersDao jpauser = new JpaUsersDao(PersistanceManager.getEntityManagerFactory());
		
		request.setAttribute("user", jpauser.findByCampusBooster(idBooster));
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/profile.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
