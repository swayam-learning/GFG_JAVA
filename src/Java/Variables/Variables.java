package Java.Variables;

public class Variables {
    public static void main(String[] args) {
        /* there are three types of variables
         * 1.Local Java.Variables.Variables
         * 2.Static Java.Variables.Variables
         * 3.Instance Java.Variables.Variables
         */
        int age =20;
        String name = "swayam";
        System.out.println(age);
        // here age is a local variable it scopes end with the block denoted with the second last "}"
        // now local always needs to be initialised or else it gives error "variable age might not have been initialized"
    }
}
