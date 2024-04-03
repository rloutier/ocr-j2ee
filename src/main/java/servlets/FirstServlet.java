package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customMessage = "Yet another message here!";
		String pName = request.getParameter("name");

		request.setAttribute("customMessage", customMessage);
		request.setAttribute("name", pName);
		this.getServletContext().getRequestDispatcher("/WEB-INF/first.jsp").forward(request, response);
	}
}
