public class Testconstructorwiththiskeyword {

    int a;
    String b;
    public Testconstructorwiththiskeyword(){
        System.out.println("Parent class constructor: This is the default constructor");
    }
    public Testconstructorwiththiskeyword(int i){
        this.a = i;
        System.out.println("initialize the value of i "+a);

    }
    public Testconstructorwiththiskeyword(int i, String name){
        this.a = i;
        this.b = name;
        System.out.println("initialize the value of i "+a);
        System.out.println("initialize the value of name "+b);

    }
    public static void main(String[] args) {
        Testconstructorwiththiskeyword x = new Testconstructorwiththiskeyword();
        Testconstructorwiththiskeyword x1 = new Testconstructorwiththiskeyword(20);
        Testconstructorwiththiskeyword x2 = new Testconstructorwiththiskeyword(12,"Jishu");
    }
}
