class Human{
	int height;
	int weight;
	int color;
}
public class DebugDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1        1
		 * 12      12 
		 * 123    123
		 * 1234  1234
		 * 1234512345
		 */
		
		for(int row = 1; row<=5; row++){
			for(int col = 1; col<=row; col++){
				System.out.print(col);
			}
			
			System.out.println();
		}
		int k [] = {10,20};
		//System s = new System();
		Human amit = new Human();
		System.out.println("  Human      "   +amit+" "+amit.hashCode());
		int p[][]= new int[3][];
		long t[]={10,20};
		System.out.println("T is "+t);
		p[0]= new int[10];
		p[1] = new int[20];
		p[2]= new int[30];
		System.out.println("Array    "+p+"  "+k+ " "+k.length);
		
		
//		for(int i = 0; i<p.length; i++){
//			for(int j = 0; j<p[i].length; j++){
//				System.out.print(p[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		for(int i[] : p){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		int x[] = new int[]{10,20,30,40,50,60};
		//int x[] = new int[5];
		// int x[5]; // Wrong in Java
		//int []x={10,20,30,40,50,60};
//		for(int i = 0 ; i<x.length; i++){
//			System.out.println(x[i]);
//		}
		// Java 1.5 (Enhance For Loop)
		for(int i : x){
			System.out.println(i);
		}
		
	}

}
