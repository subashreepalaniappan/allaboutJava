public class BMW extends Car{

    //BMW class is the child class of Car class, inherits all the properties of the parent class
    // extends keyword is used to refer the parent class


    //when same method is present in parent as well as child class with same name and same number of arguments is called method overriding
    @Override
    public  void start(){  //overriden method
        System.out.println("BMW_________Start");
    }
    public  void theftsafety(){
        System.out.println("BMW---------TheftSafety");
    }
}