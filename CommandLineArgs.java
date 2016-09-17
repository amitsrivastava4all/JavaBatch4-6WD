class CommandLineArgs
{
    // Integer.parseInt - used to convert String into int
public static void main(String args[]){
    int a =Integer.parseInt(args[0]); // Local Variables must be initalize
    int b = Integer.parseInt(args[1]);
    int c  =  a + b;
    System.out.println("Sum is "+c);
    
}
}