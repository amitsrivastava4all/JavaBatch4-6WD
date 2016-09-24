strictfp class DataTypes
{
public static void main(String args[]){
    //BigInteger b ;
    //BigDecimal bd;
    long t = 1000; // 8 byte
    int a=100; // 4 byte
    short tt = 100; // 2 byte
    byte e = 100; // 1 byte
    // 1 byte = 8 bit
    // 0 , 1 Base - 2
    // 7 Bit is for number and 1 bit is for + -
    // -2 ^ 7  to 2 ^ 7 - 1
    // - 128 to 127
    // a is a variable of type int
    // it can only contain non-decimal values
    byte age = (byte)130;
    System.out.println("उम्र है "+age);
    
    
    // Decimal
    // 1 float and double
    float r = 90.20f; // 4 byte
    double r1 = 100.20;
    
    char e1 = 'X';   // 2 byte
    // ASCII
    // UNICODE  UTF - 
    boolean p = true; //1 byte , 2 byte , 4 byte
}
}