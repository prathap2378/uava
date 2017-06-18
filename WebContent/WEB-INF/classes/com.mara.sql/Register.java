package com.mara.sql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Register
 */
@WebServlet(urlPatterns = "/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     *//*
    public Register() {
        super();
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.setAttribute("name","My First Event");
		request.getRequestDispatcher("/AddEvent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		//response.getWriter().println("In do post");
		request.getRequestDispatcher("/Process.jsp");
		/*response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("firstName");
        String email = request.getParameter("lastName");
        String pass = request.getParameter("phoneNumber");
        Connection conn;
        try {
			conn = MysqlConnection.getConnection();
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement("insert into student(name,email,pass) values (?,?,?)");
			statement.setString(1, name);
			System.out.println("name in servlet= "+name);
			statement.setString(2, email);
			statement.setString(3, pass);
			int i = statement.executeUpdate();
			
			if(i>0){
				out.println("You are succefully registered...");
			}
			statement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
        
	}
}
