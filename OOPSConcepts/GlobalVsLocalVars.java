public class GlobalVsLocalVars{
    String s = "selenium";
    int i=0;

    //Global var once modified in a method, same value applies throughout the class unless its value is modified again
    public void sum(){
        System.out.println("Initial value of i is "+i);
        i=100;
        System.out.println("Modified value of i is "+i);
        //return i++;
    }
    public int multiply(){
        i=1;
        System.out.println("The value of i before modifying in this method is "+i);
        return i*500;
    }

    //local variable specific only to this method
    public int printstring(){
        System.out.println(s+" logic");
        int x = 20;
        int y = 90;
        int z = x*y;
        return z;
    }

    public static void main(String[] args){
        GlobalVsLocalVars obj = new GlobalVsLocalVars();
        System.out.println(obj.i);  //global variable is called using the object reference
        System.out.println(obj.s);

        obj.sum();
        //int a = obj.sum();
        //System.out.println(a);

        int b = obj.multiply(); 
        System.out.println(b);

        int c = obj.printstring();
        System.out.println(c);
    }
}