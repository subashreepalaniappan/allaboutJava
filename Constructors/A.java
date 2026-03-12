public class A{
    int a;
    String b;
    public A(){
        System.out.println("Parent class constructor: This is the default constructor");
    }
    public A(int i){
        this.a = i;
        System.out.println("initialize the value of i "+a);

    }
    public A(int i,String name){
        this.a = i;
        this.b = name;
        System.out.println("initialize the value of i "+a);
        System.out.println("initialize the value of name "+b);

    }
}