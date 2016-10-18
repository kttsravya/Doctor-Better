package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Services.CardioDoctorList;
import Data.Doctor;

public class CardioDoctorListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Doctor> cardioDoctorList = CardioDoctorList.getCardioDoctorList();
		request.setAttribute("cardiodoctorlist", cardioDoctorList);

		// forward request to JSP(view)

		ServletContext context = getServletContext();
		RequestDispatcher dispatch = context.getRequestDispatcher("/CardioDoctorListJsp.jsp");
		dispatch.forward(request, response);
	}

}
