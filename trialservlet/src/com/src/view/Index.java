package com.src.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index.view")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out =response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<form action='Display.view' method='post'>");
	out.println("Username");
	out.println("<input type='text' name='username'>");
	out.println("Password");
	out.println("<input type='text' name='password'>");
	
	out.println("<input type='submit' value='signup'>");

	out.println("</form>");
	out.println("</body>");
	out.println("</html>");
	
	}

}
