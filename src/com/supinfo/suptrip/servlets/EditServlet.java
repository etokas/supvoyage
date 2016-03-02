package com.supinfo.suptrip.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supinfo.suptrip.dao.jpa.JpaUsersDao;
import com.supinfo.suptrip.manager.PersistanceManager;
import com.supinfo.suptrip.models.Users;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet(name = "edit", urlPatterns = { "/edit" })
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JpaUsersDao jpauser = new JpaUsersDao(PersistanceManager.getEntityManagerFactory());

		String id = request.getParameter("idbooster");
		String email = request.getParameter("email");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String campus = request.getParameter("campus");
		
		Users user = new Users();
		
		user.setIdbooster(id);
		user.setEmailAdress(email);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setPassword(password);
		
		jpauser.updateUser(user);
		
		doGet(request,response);
		
	}

}



