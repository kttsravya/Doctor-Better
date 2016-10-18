package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Services.TypesOfDoctors;

public class TypesOfDoctorsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> docTypeslist = TypesOfDoctors.getTypesOfDoctorsList();
		request.setAttribute("typeofdoctorslist", docTypeslist);

		// forward request to JSP(view)

		ServletContext context = getServletContext();
		RequestDispatcher dispatch = context.getRequestDispatcher("/TypesOfDoctorsJsp.jsp");
		dispatch.forward(request, response);
	}

}
