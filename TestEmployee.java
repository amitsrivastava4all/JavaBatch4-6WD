import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Salary ");
		double salary = scanner.nextDouble();
		Employee ram = new Employee(id, firstName, lastName, salary);
		ram.printSalarySlip();
		System.out.println("***************************************");
		ram.setSalary(ram.getSalary()+ 10000);
		ram.printSalarySlip();
		scanner.close();

	}

}
