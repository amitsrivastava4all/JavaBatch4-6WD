
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private final String COMPANY_NAME;
	private double salary;
	private final int PF ;
	private int bonus;
	private double netSalary;
	private String email;
	private String phoneNumber;
	private String managerName;
	private String deptName;
	Employee(){
		PF = 900;
		COMPANY_NAME="TCS";
	}
	Employee(int id , String firstName, String lastName, double salary){
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName=lastName;
		this.salary = salary;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public int getPF() {
		return PF;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
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
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	private double hra(){
		return salary*0.30;
	}
	private double da(){
		return salary*0.20;
	}
	private double ta(){
		return salary*0.10;
	}
	
	private double netSalary(){
		return salary + hra() + ta() + da() - PF;
	}
	
	public void printSalarySlip(){
		System.out.println("Id "+id);
		System.out.println("Name "+firstName+" "+lastName);
		System.out.println("Salary "+salary);
		System.out.println("HRA "+hra());
		System.out.println("DA "+da());
		System.out.println("TA "+ta());
		netSalary = netSalary();
		System.out.println("NET Salary "+netSalary);
	}
	

}
