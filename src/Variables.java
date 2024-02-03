public class Variables {
    public static void main(String[] args) {
        //in java, c and c++ we must declare the data type and hence called as statically typed languages
        //variable naming convention camel case: name,current_Year,this_Year_is_Called,
        //constant variables are written upper case eg:MAX_AGE
        //--------Primitive Data Types--------
        /* boolean : true or false
            byte : -2^7 to (2^7)-1 8 bit long
            char: single character
            short : -2^15 to (2^15)-1 16 bit long
            int : -2^31 to (2^31)-1 32 bit long
            long : -2^63 to (2^63)-1 864 bit long
            for bigger integer value more than long we can use biginteger
            float : single precision  32 bit
            double : double precision 32 bit
            character : 32 bit unicode character('\u0000' to '\uffff')
         */
        //---------non - primitive datatype---------------
        //any user defined classes or default classes or no primitive data type
        // we create object of non-primitive data types using "new" keyword
        //we access these data types using "." operator
        /* non-primitive data types are allocated in the heap memory and if we don't initialized any value
        then default value is taken
         */
        point p1 = new point();//here new memory is allocated for p1
        p1.x = 10;
        p1.y = 20;
        System.out.println(p1.x);
        System.out.println(p1.y);
        point p2 = p1; // now p2 and p1 both are reffering to the same value
        // in the above line no new memory is allocated for p2
        p2.x = 30;
        System.out.println(p1.x);
        System.out.println(p2.x);
         /* non-primitive data types refer to the same memory location so in case of
         so here both p1 and p2 refer to the same memory location hence when p2 makes some change to \
         the variable x it also makes changes for the p1 object but in case of primitve data
         types there is no change.
          */
    }
}
class point {
    int x;
    int y;

}
