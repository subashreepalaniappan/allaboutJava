public class TestCar{
    
    public static void main(String[] args) {

        //compile-time polymorphism or static polymorphism 
        // create obj ref to child class and call a method available in both parent & child classs
        // At the  time of compilation, it runs the method based on parent/child class oject refernce. it uses method overloading concept
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();

        System.out.println("_______________________________________________");

        Car c = new Car();
        c.start();
        c.stop();
        c.engine();

        System.out.println("_______________________________________________");

        // Top Casting / Run-time polymorphism / dynamic polymorphism
        // child class object can be referred by parent class object reference variable
        // only overriden method in child class and all the parent class methods are accessible
        Car c1 = new BMW();
        c1.start();
        c1.stop();
        c1.refuel();
        c1.engine();

        //Down casting is not possible
        // throws class cast exception
        BMW b1 = (BMW)new Car();
    }
}