package database;

public class Employee {
	private Integer employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private String officeCode;
	private Integer reportsTo;
	private String jobTitle;
	private Integer VacationHours;
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public Integer getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Integer getVacationHours() {
		return VacationHours;
	}
	public void setVacationHours(Integer vacationHours) {
		VacationHours = vacationHours;
	}
	public String toString() {
		return "|" + employeeNumber.toString() + "|" + lastName + "|" + firstName + "|" + extension + "|" + email  + "|" + officeCode  + "|" + reportsTo.toString() + "|" + jobTitle + "|" + VacationHours.toString()+"|";
	}
}
