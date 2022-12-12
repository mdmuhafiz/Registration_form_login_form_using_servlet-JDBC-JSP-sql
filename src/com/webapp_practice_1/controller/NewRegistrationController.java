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


@WebServlet("/reg")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NewRegistrationController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
		rd.forward(request, response);
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	
	DAO dao = new DAOImpl();
	dao.connectDB();
	
	dao.saveReg(name,city,email,mobile);
	request.setAttribute("massage", "Record is Saved Successfully");
	
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
	rd.forward(request, response);

	
	
	
	
	
	
	}

}
