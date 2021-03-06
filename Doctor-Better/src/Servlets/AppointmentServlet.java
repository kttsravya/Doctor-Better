package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getAttributeNames();

		// forward request to JSP(view)

		ServletContext context = getServletContext();
		RequestDispatcher dispatch = context.getRequestDispatcher("/AppointmentJsp.jsp");
		dispatch.forward(request, response);
	}
}
