public class Functions{

    // static method 
    // main method is the starting point of execution
    // main method is void because we never returns a value
    public static void main(String[] args) {
        Functions obj = new Functions();
        obj.test();

        int i = obj.someOP();
        System.out.println(i);

        String ss = obj.someOP1();
        System.out.println(ss);

        int j = obj.SomeIPOP(10, 100);  
        System.out.println(j);      
    }

    //non static methods
    //no input no output, void doesn't return any value
    //return type -> void
    public void test(){
        System.out.println("This is a test method");
    }

    // data type mentioned next to public keyword refers to return value
    //no input some output
    //return type -> int
    public int someOP(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public String someOP1(){
        String s = "selenium";
        System.out.println("Below is the string name");
        return s;
    }

    //some input some output
    //return type -> int
    // x, y -> input parameters
    public int SomeIPOP(int x, int y){
        int z = x*y;
        return z;
    }
}