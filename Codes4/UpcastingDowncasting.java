class P1
{
	int x ;
	P1(){
		x = 100;
	}
	void print(){
		System.out.println("P1 Print");
	}
	
}
class P2 extends P1
{
	int x;
	P2(){
		x = 1000;
	}
	@Override
	void print(){
		System.out.println("P2 Print");
	}
}
class P3 extends P2{
	int x;
	int y;
	int m;
	P3(int x){
		 int z = x + this.x + ((P2)this).x + ((P1)this).x;
		 System.out.println(z);
	}
	@Override
	void print(){
		System.out.println("P3 Print "+x);
		System.out.println(y);
		System.out.println(m);
	}
}


class Shape
{
	void draw(){
		System.out.println("Shape Draw..");
	}
	void area(){
		System.out.println("Shape Area..");
	}
}
class Circle extends Shape
{
	void area(){
		System.out.println("Circle Area...");
	}
}
class Square extends Shape
{
	void area(){
		System.out.println("Square Area...");
	}
	void allSideEquals(){
		System.out.println("All Side Equals...");
	}
}

class Drawing{
	void drawShapes(Shape shape){
		shape.area();
		if(shape instanceof Square){
			Square square = (Square) shape; // Downcasting
			square.allSideEquals();
		}
	}
}
public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Drawing drawing = new Drawing();
//		Shape circle = new Circle(); // Upcasting
//		drawing.drawShapes(circle);
//		drawing.drawShapes(new Circle()); //Upcasting
//		drawing.drawShapes(new Square());
//		
		
		P1 obj = new P3(1);
		obj.print();
		System.out.println(obj.x);
		

	}

}
