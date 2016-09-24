import java.util.Scanner;
//import java.lang.*;
class TakeInput
{
public static void main(String args[]){
    // Scanner is a predefine class
    // System.in - is used to take input from the user
    // Scanner is a buffer 
    // 2.4 Ghz or 3.0 Ghz
    // 1 Khz = 1024 Hz (1 sec)
    // 1 Mhz = 1024Khz
    // 3 X  1 Ghz = 1024 Mhz
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("अब पहले नंबर दर्ज");
    int firstNo = scanner.nextInt();
    System.out.println("अब दूसरे नंबर दर्ज");
    int secondNo = scanner.nextInt();
    int result = firstNo + secondNo;
    System.out.println("योग है "+result);
    scanner.close();
    
}
}