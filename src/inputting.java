import java.io.*;
public class inputting {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line");
        String s = br.readLine();
        System.out.println("you entered this "+s);
    }
}
