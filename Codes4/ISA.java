/*
 * Why we Override?
 * When U Inherit the parent feature is come in child , and if the
 * parent feature is outdated , then u override it
 * Overriding is dependent on Inheritance
 * Method Signature must be match with parent method
 */
class Product
{
	int id ;
	String name;
	double price;
	String companyName;
	Product(){
		//id =1001;
		//name="P1";
		//price =0.0;
		companyName = "FlipKart";
		System.out.println("Parent class Default cons call");
	}
	Product(int id , String name, double price){
		this();
		// Shadow Problem
		this.id = id; // Instance Variable and Local Variable name is same
		// Identify Instance Variable (this)
		this.name = name;
		this.price = price;
		System.out.println("Parent class Param Cons Call");
	}
	void printDetails(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Price "+price);
		System.out.println("CompanyName "+companyName);
	}
}
class Mobile extends Product
{
	// x , y
	final int THIRTY_DAY_MONEYBACK = 30;
	String insurance;
	Mobile(){
		// by default it call parent class default cons
		// implicit super call  super();
		insurance = "ICICI";
		System.out.println("Child Class Default Cons Call");
	}
	Mobile(String insurance,int id , String name, double price){
		super(id,name,price); // Explicit Cons Call
		this.insurance = insurance;
		System.out.println("Child Class Param Cons Call");
	}
	@Override
	// @Override it is a Annotation in Java
	// Annotation provide low level info to compiler
	void printDetails(){
		super.printDetails();
		System.out.println("Insurance is "+insurance);
		System.out.println("No Of Days Money Back "+THIRTY_DAY_MONEYBACK);
	}
	void printDetails(int x){
		System.out.println("I am a Overloading , not overriding...");
	}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile motox = new Mobile("HDFC",1001,"Samsung A6",9999);
		//motox.show();
		motox.printDetails();
		
		int x[] = {10,20,30,40,50};
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i = 0; i<x.length; i++){
			sum = sum + x[i] *2;
			//System.out.println(x[i]*2);
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		
	}

}
