package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO {
	public ArrayList<Employee> findByFirstName(String firstName, String lastName) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Ennis-1998";
		Connection connection = null;
		Statement stmt = null;
		ResultSet result = null;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			connection = DriverManager.getConnection(dburl, user, password);
			System.out.println(connection.isReadOnly());

			String SelectSQL = "SELECT * FROM employees WHERE firstName = '" + firstName + "' AND lastName = '"
					+ lastName + "'";
			stmt = connection.prepareStatement(SelectSQL);
			result = stmt.executeQuery(SelectSQL);

			while (result.next()) {
				Employee e = new Employee();
				e.setEmail(result.getString("email"));
				e.setEmployeeNumber(result.getInt("employeeNumber"));
				e.setExtension(result.getString("extension"));
				e.setFirstName(result.getString("firstName"));
				e.setJobTitle(result.getString("jobTitle"));
				e.setLastName(result.getString("lastName"));
				e.setOfficeCode(result.getString("officeCode"));
				e.setReportsTo(result.getInt("reportsTo"));
				e.setVacationHours(result.getInt("VacationHours"));
				employees.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}

	public ArrayList<Employee> findByEmail(String email) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Ennis-1998";
		Connection connection = null;
		Statement stmt = null;
		ResultSet result = null;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			connection = DriverManager.getConnection(dburl, user, password);
			System.out.println(connection.isReadOnly());

			String SelectSQL = "SELECT * FROM employees WHERE email = '"+email+"'";
			stmt = connection.prepareStatement(SelectSQL);
			result = stmt.executeQuery(SelectSQL);

			while (result.next()) {
				Employee e = new Employee();
				e.setEmail(result.getString("email"));
				e.setEmployeeNumber(result.getInt("employeeNumber"));
				e.setExtension(result.getString("extension"));
				e.setFirstName(result.getString("firstName"));
				e.setJobTitle(result.getString("jobTitle"));
				e.setLastName(result.getString("lastName"));
				e.setOfficeCode(result.getString("officeCode"));
				e.setReportsTo(result.getInt("reportsTo"));
				e.setVacationHours(result.getInt("VacationHours"));
				employees.add(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}
}
