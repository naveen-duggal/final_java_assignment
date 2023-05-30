package in.ineuron.com;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/servlet/Register")
public class Register extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		out.println("<html><body>");
		out.println("<h1>Welcome to "+firstName+" "+lastName+"</h1>");
		out.println("<html><body>");
		out.close();
	}

}