class MainWays
{
    // this is called main overloading
    public static void main(){
        System.out.println("this is without args main....");
    }
    public static void main(int x){
        System.out.println("this is one int args main....");
    }
static public  void main(String ...arg){
    System.out.println("Hello Java !");
    main();
    main(100);
}
}