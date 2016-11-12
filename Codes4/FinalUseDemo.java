// SRP , DRY 
// S O L I D
// Open Close Pr
// Class is OPen For Extension and CLose for Modification
/*
 * final with class no inheritance
 * final with method means no Overriding
 * final for define a constant
 */
//final class Parent
class Parent
{
	final int MAX = 100;
	final void show(){
		System.out.println("Parent Show ");
	}
	final private void print(){
		System.out.println("Print Call...");
	}
}
class Child extends Parent
{
	void show(int x){
		System.out.println("Iam overloading...");
	}
	
	void print(){
		System.out.println("another print call");
	}
}
public class FinalUseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Math.abs(-99);
		System.out.println(Math.sqrt(25) + 10);

	}

}
