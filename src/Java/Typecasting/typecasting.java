package Java.Typecasting;

public class typecasting {
    public static void main(String[] args) {
        //widening or implicit conversion
        int i = 20;
        long x = i;
        float y = x;
        float z = i;
        System.out.println(i);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //narrowing or explicit conversion
        double d = 98;
        int a = (int) d;
        char c = (char) a;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);


    }
}
