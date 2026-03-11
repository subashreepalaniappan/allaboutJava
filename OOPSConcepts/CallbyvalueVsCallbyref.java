public class CallbyvalueVsCallbyref{
    
    int p,q;

    public int sum(int x, int y){
        int c = x+y;
        return c;
    }
    public void swap(CallbyvalueVsCallbyref t){
        int temp = t.p;
        t.p = t.q;
        t.q = temp;
    }

    public static void main(String[] args) {
        //call by value - call the method by passing the value
        //copy of the passed values are given to the method variables
        CallbyvalueVsCallbyref obj = new CallbyvalueVsCallbyref();
        int z = obj.sum(10,20);
        System.out.println("CallbyValue "+z);

        //call by reference - passing the value of object reference as we do not have pointers in java
        //address of the particular variable is called location pointer/pointer in c
        obj.p=1;
        obj.q=5;
        obj.swap(obj);
        //after swapping
        System.out.println("value of p is "+obj.p+" value of q is "+obj.q);

    }

}