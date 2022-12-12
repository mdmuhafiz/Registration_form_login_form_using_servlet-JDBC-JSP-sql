package com.webapp_practice_1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp_practice_1.model.DAO;
import com.webapp_practice_1.model.DAOImpl;


@WebServlet("/verifyLogin")
public class VerifyLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public VerifyLoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	DAO dao = new DAOImpl();
	dao.connectDB();
	
	boolean status = dao.verifyCredentials(email,password);
	if(status == true) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
		rd.forward(request, response);
		
		
	}else {
		request.setAttribute("massage", "Invalid Email/Passowrd");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.include(request, response);
		
	}
	
	
	
	
	
	}

}
