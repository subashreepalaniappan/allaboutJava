public class Cars{

    int model;
    int wheel;

    public static void main(String[] args){
        
        //create an object of the class
        // a is the object reference referring to Car class
        // a copy of all variables and methods are given to 'a'
        Cars a = new Cars();
        Cars b = new Cars();
        Cars c = new Cars();

        a.model = 2015;
        a.wheel = 4;

        b.model = 2019;
        b.wheel = 6;

        c.model = 2025;
        c.wheel = 8;

        System.out.println(a.model);
        System.out.println(a.wheel);

        System.out.println(b.model);
        System.out.println(b.wheel);

        System.out.println(c.model);
        System.out.println(c.wheel);

        //let's shift the references:
        a=b;
        b=c;
        c=a;

        //after shiting references
        System.out.println(a.model);
        a.model = 2020;
        System.out.println(a.model);
        c.model = 2024;
        System.out.println(a.model);  
    }
}