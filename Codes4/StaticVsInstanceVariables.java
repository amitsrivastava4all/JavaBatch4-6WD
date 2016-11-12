class ITEmployee{
	int id ; // Instance Variables
	String name;
	static int counter;
	ITEmployee(int id, String name){
		this.id = id;
		this.name =name;
		counter++;
		System.out.println("I will Call Every time when object is created Counter "+counter);
	}
	static{
		System.out.println("I Will Call Only Once When Class is Loaded..."+counter);
	}
}
public class StaticVsInstanceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counter is "+ITEmployee.counter);
		ITEmployee ram = new ITEmployee(1001,"Ram");
		System.out.println(ram.id +" "+ram.name);
		ITEmployee shyam = new ITEmployee(1002, "shyam");
				System.out.println(shyam.id +" "+shyam.name);
	}

}
