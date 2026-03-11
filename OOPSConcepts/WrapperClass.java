public class WrapperClass{
    public static void main(String[] args) {
        //String conversion
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);

        String a = "100.670090";
        float j = Float.parseFloat(a);
        System.out.println(j);
    
        String b = "100.678890";
        double k = Double.parseDouble(b);
        System.out.println(k);

        String c = "True";
        boolean l = Boolean.parseBoolean(c);
        System.out.println(l);   

        int m = 200;
        String d = String.valueOf(m);
        System.out.println(d);

        //Throws number format exception  when the string is not pure numberal value
        String n = "100A";
        int e = Integer.parseInt(n);
        System.out.println(e);
    }
}