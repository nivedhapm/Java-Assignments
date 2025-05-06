package classesAndObjects;

public class Employee {
	private String name;
	private int id;
	private String email;
	private String phoneNumber;
	private String address;
	private String dateOfBirth;
	private String gender;
	private String jobTitle;
	private String department;
	private String employeeType;
	private double salary;
	public static final String companyName = "ZOHO Corp";
	public static int totalEmployees;
	
	
	public Employee(String name, int id, String email, String phoneNumber, String address, String dateOfBirth,
			String gender, String jobTitle, String department, String employeeType, double salary) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.department = department;
		this.employeeType = employeeType;
		this.salary = salary;
		totalEmployees++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getEmployeeType() {
		return employeeType;
	}


	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EMPLOYEE PERSONAL DETAILS: \n\nName: " + name + "\nEmail-Id: " + email + "\nPhone Number: " + phoneNumber
				+ "\nAddress: " + address + "\nDate Of Birth: " + dateOfBirth + "\nGender: " + gender + "\n\nEMPLOYEE JOB DETAILS: \n\nJob Title: "
				+ jobTitle + "\nEmployee-Id: " + id + "\nDepartment: " + department + "\nEmployeeType: " + employeeType + "\nSalary: " + salary;
	}
	
	
	
}
