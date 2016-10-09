// OOPS 
// 1. Encapsulation - member variables + member methods 
// e.g class is the example of encapsulation
// Gud Encapsulation - private member variables and public member methods
// Data Hiding - Making member variables private 
public class Student {
	// Member variable of a class must be private
	private int id;
	private String name;
	private String course;
	private String collegeName;
	
	/*
	 * Constructor Name is same as class name
	 * it is used to initalize the member variable (Instance Variables)
	 *  of a class
	 *  It is by default of void type can't return 
	 *  Every class has default constructor by default
	 *  If u create any other cons , the default is gone
	 *  A class have many cons , this is called cons overloading
	 */
	// Default Cons
	// Every Class by default has default constructor
Student(){
		collegeName="SRCC";
		}

Student(String course){
	this();
	this.course = course;
}

//private boolean validate(){
//	
//}
	
	// Param Cons
Student(int id , String name , String course)
	{
	   this(course); // Calling default cons
		this.id = id+collegeName.length();
		this.name = name;
		//this(course);
		//this.course = course;
}
	// Member methods must be public
	public void takeInput(int id, String name, String course){
		if(id>0){
		this.id = id;  // Local Variable value is assign to Member Variable
		this.name = name;
		this.course = course;
		}
		else
		{
			System.out.println("Invalid Id");
		}
	}
	
	public void print(){
		// this - It is a Keyword , and it hold the current reference
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("CollegeName "+collegeName);
	}

}
