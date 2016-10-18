
package DataBases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;


public class InsertPatientInfoInDataBaseDataSource {

	static String name;
	static String phoneNumber;
	static String insuranceDetails;
	static String emailId;
	static String medicalProblem;
	static String emergencyPhoneNumber;
	static String city;
	static String address;
	static HttpServletRequest request;

	private static DataSource studentDbDataSource = null;

	public static DataSource initDataSource() throws NamingException {
		Context initContext;

		try {
			initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/doctorsproject_database");

			return dataSource;
		} finally {
		}
	}

	public static Connection getConnection() throws NamingException, SQLException {
		Connection dbConn;

		if (studentDbDataSource == null) {
			studentDbDataSource = initDataSource();
		}

		dbConn = studentDbDataSource.getConnection();
		return dbConn;
	}

	public static long getGeneratedPrimaryKey(PreparedStatement sqlStmt) throws SQLException {
		long id = -1;

		try (ResultSet generatedKeys = sqlStmt.getGeneratedKeys()) {
			if (generatedKeys.next()) {
				id = generatedKeys.getLong(1);
			}
		}

		return id;
	}

	public static void insertPatientInfoWithConn(HttpServletRequest request1, Connection dbConn)
			throws SQLException, NamingException {
		
		name = request.getParameter("name");
		emailId = (String) request.getParameter("emailId");
		medicalProblem = (String) request.getParameter("problem");
		city = (String) request.getParameter("city");
		phoneNumber = (String) request.getParameter("phonenumber");
		insuranceDetails = (String) request.getParameter("insurance");
		emergencyPhoneNumber = (String) request.getParameter("emergencynumber");
		address = (String) request.getParameter("address");

		// step 2: create a statement

		java.sql.Statement st = dbConn.createStatement();

		String toInsert = "INSERT INTO `doctorsproject_database`.`patient_info` (`phoneNumber`, `name`, `emailId`, `medicalProblem`, `city`, `insuranceDetails`, `emergencyPhoneNum`,`address`) "
				+ "VALUES ('" + phoneNumber + "', '" + name + "', '" + emailId + "', '" + medicalProblem + "', '" + city
				+ "', '" + insuranceDetails + "', '" + emergencyPhoneNumber + "','" + address + "');";
		System.out.println(toInsert);
		st.executeUpdate(toInsert);
	}

	public static void insertPatientInfo(HttpServletRequest request1) throws SQLException, NamingException {
		request = request1;

		try (Connection dbConn = getConnection()) {
			// Turn off auto-commit so we can use transactions
			dbConn.setAutoCommit(false);

			/*
			 * We are now operating under a transaction, rollback on an
			 * exception or commit on successful completion
			 */
			try {
				insertPatientInfoWithConn(request, dbConn);
				dbConn.commit(); /*
									 * End of transaction. Since it was
									 * successful, commit it.
									 */
			} catch (Exception ex) {
				dbConn.rollback();
				throw ex; /*
							 * rethrow the exception so the caller function can
							 * recover from this failure
							 */
			}
		}

	}

}
