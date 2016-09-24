

class DataTypesDemo2
{
public static void main(String args[]){
    
    // Primitive Data Types or Value Data Type
    // 1. Non-Decimal
    // byte , short , int , long
    byte x = 100;
    byte yy = x;
    byte age = 21;
    // short - 2 byte
    int w ; // 4 byte
    long r = 10L; // l or L // 8 byte
    // x is a variable of byte type
    // 1 byte consume
    // 1 byte - 8 bit
    // 2 byte - 16 bit
    // 7 Bit provide for range and 1 bit for + -
    // Bit 0 , 1 Base - 2
    // - 2 ^ 7  to 2 ^ 7 - 1
    // -128 to 127
    // - 2 ^ 15 to 2^ 15 -1
    // -32768 to 32767
    
    // 1 >= 5 Volt , 0 < 5 Volt
    
    // 2. Decimal
    // float , double
    // float - 4 byte , double  8 byte
    float p = 90.20f; // f or F
    double p1  = 90.1234567;
    
    // 3. char 
    char k = 'A';  // 2byte (UniCode)
    
    // 4. boolean
    boolean isPresent = true;  // 1 , false - 0
    // 1 byte , 2 byte , 4 byte (Depedent on O/S to O/S)
    String k1 ="Hello";
    // String is a predefine class and it is a collection of chars
    System.out.println(k1);
    k1 = "नमस्ते";
    System.out.println(k1);
    
   // String bb = "Hello Ram"; // Reference Data Type
//    String cc = bb;
    // String Object ways are 2
    // 1. String Literal e.g. String name ="amit";
    // First check in a pool, if object is not in a pool then create a new otherwise point to the same object 
    // 2. new String() - always create a new object
  String name ="amit";
    String name2 = "amit";
    String name3 = new String("AMIT");
    //name2="ram";
    
    if(name==name3){
        System.out.println("Same Reference");
    }
    else
    {
        System.out.println("Not Same Reference");
    }
    
    if(name.equalsIgnoreCase(name3)){
        System.out.println("Same Value");
    }
    else{
        System.out.println("Not Same Value");
    }
}

}
