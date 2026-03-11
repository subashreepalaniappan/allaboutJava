public class StaticandNonStatic{
    //Static and non-static vars & methods
    String s = "Hello World!!!";
    static int a = 1995;

    public static void sum(){
        a++;
        System.out.println("Calling static variable inside static method directly: "+a);
        StaticandNonStatic.a = 60+a;
        System.out.println("Calling static variable inside static method by classname: "+a);

        StaticandNonStatic obj = new StaticandNonStatic();
        System.out.println("Calling non static variable inside static method by object reference: "+obj.s);

    } 

    public void addition(){
        a=0;
        System.out.println("Calling static variable inside non static method directly: "+a);
        StaticandNonStatic.a = 60+a;
        System.out.println("Calling static variable inside non static method by classname: "+a);

        System.out.println("Calling non static variable inside non static method directly "+s);
        
        StaticandNonStatic obj = new StaticandNonStatic();
        System.out.println("Calling non static variable inside non static method by object reference: "+obj.s);

    }

    public static void test(){
        System.out.println("sample check");
    }

    
    public static void main(String[] arg){

        System.out.println("Calling Static method inside static method directly: _________________________");
        sum();

        System.out.println("Calling Static method inside static method by classname: _________________________");
        StaticandNonStatic.test();

        System.out.println("Calling non Static method inside static method by obj ref: _________________________");
        StaticandNonStatic obj = new StaticandNonStatic();
        obj.addition();

        System.out.println("Calling Static method inside static method by obj ref but warning is given: _________________________");
        obj.test();
        
    }
}