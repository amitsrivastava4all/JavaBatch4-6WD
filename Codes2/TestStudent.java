import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		//int p ;
		//p++;
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Course");
		String course = scanner.next();
		Student ram = new Student(id,name,course);
		//ram = new Student();
		//id = 1001;
		//ram.id = -1001;  //77.id=1001
		//ram.name = "Ram";
		//ram.course="B.TECH";
		//ram.takeInput(-1001, "Ram", "B.TECH");
		//ram.id = -9999;
		ram.print();
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.course);
		
		
		//Student shyam = new Student();
		//shyam.takeInput(1002, "Shyam", "MCA");
		//shyam.id = 1002;
		//shyam.name = "SHYAM";
		//shyam.course="MCA";
		//System.out.println("Shyam .....");
		//shyam.print();
//		System.out.println(shyam.id);
//		System.out.println(shyam.name);
//		System.out.println(shyam.course);
		
		
		int x=1000;

	}

}
