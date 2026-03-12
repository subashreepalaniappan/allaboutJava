public class B extends A{
    public B(){
        super(); //calls default constructor
        //super(10); - to call parameterized constructor pass the value 
        System.out.println("Child class constructor");
    }

    //to call all the parameterized constructor create multiple child class constructors

    public B(int i){
        super(i);
    }

    public B(int i, String j){
        super(i,j);
    }

    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(10);
        B obj2 = new B(2,"Vishu");
    }
}
