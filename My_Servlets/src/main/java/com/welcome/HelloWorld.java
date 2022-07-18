package com.welcome;

import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println("<html><head><title>My First display from DB</title></head>");
		try {
		 JDBC j = new JDBC();
		 //j.configureDbQuery();
		List<Object> rp = j.configureDbQuery();
		
		request.setAttribute("myresult", rp);
		request.getRequestDispatcher("HTML/stud_form.jsp").forward(request, response);
		out.println("<body> <h2> Welcome to My First Servlet Folks</h2></body></html>");
		
		}
	catch(Exception e) {
		System.err.println("User Error Message:"+e);
	} 
		
	}
}

	


/*while(rp.next()) {
    String name
        = rs.getString("stud_name"); // Retrieve name from db
    int id = rs.getInt("Id");
    String cls = rs.getString("stud_class");
    int age = rs.getInt("stud_age");
    System.out.println(id+" , "+name+" , "+cls+" , "+age); // Print result on console
    }
    */


