public class MethodOverloading{
    //Methods with same name with different argument or number of inputs
    //note for my understanding methods with same name, same no of inputs with different return data types is not allowed
    public void sum(){
        System.out.println("No input no output");
    }

    public void sum(int x){
        System.out.println("One integer input "+x);
    }

    public void sum(String s){
        System.out.println("One input but different data type "+s);
    }
    public void sum(int x, int y){
        int z = x+y;
        System.out.println("Two inputs "+x+" "+y);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum("selenium");
        obj.sum(2, 3);
        obj.main(34);
    }

    //can we overload main method? - yes
    public void main(int z){
        System.out.println("Main method overloading with input value: "+z);
    }
}