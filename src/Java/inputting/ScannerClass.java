package Java.inputting;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String b= sc.next();
        char c= sc.nextLine().charAt(0);
        float d = sc.nextFloat();
        double e = sc.nextDouble();
        long f = sc.nextLong();
    }
    // we do not  have to write any throws exception like in case of BufferedReader
}
