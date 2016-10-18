package Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Data.Patient;
import Services.FormAuthentication;

import DataBases.InsertPatientInfoInDataBaseDataSource;

public class SubmittedFormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// for form validation

		Patient patient = FormAuthentication.extractFormData(request);
		// bad form data so forward to form
		if (patient == null) {
			String name = request.getParameter("name");
			String phoneNumber = (String) request.getParameter("phonenumber");
			String insuranceDetails = (String) request.getParameter("insurance");
			String email = request.getParameter("emailId");
			// backing objects
			request.setAttribute("nameBackingObject", name);
			request.setAttribute("phoneBackingObject", phoneNumber);
			request.setAttribute("insuranceBackingObject", insuranceDetails);
			request.setAttribute("emailBackingObject", email);
			ServletContext context = getServletContext();
			RequestDispatcher dispatch = context.getRequestDispatcher("/FormJsp.jsp");
			dispatch.forward(request, response);
		} else {
			// good form data so redirecting to sucess page
			HttpSession session = request.getSession();
			session.setAttribute("patientObject", patient);
			String context = request.getContextPath();
			try {
				
				InsertPatientInfoInDataBaseDataSource.insertPatientInfo(request);
				
			} catch (Exception ex) {
				ex.printStackTrace();
				return;
			}
			response.sendRedirect(context + "/SucessJsp.jsp");
		}

	}
}
