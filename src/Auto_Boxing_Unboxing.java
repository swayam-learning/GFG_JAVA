public class Auto_Boxing_Unboxing {
    public static void main(String[] args) {
        int x1= 120;
        Integer x2=x1; //auto-boxing
        int x3=x1; //auto-unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        Integer x4=400 , x5=400;  // for smaller values it might give same same but don't  get confused
        if(x4==x5){
            System.out.println("Same same");
        }
        else{
            System.out.println("but different");
        }
        /* when we use wrapper class we are creating objects so two object which have same value
        but different memory reference */
        if(x4.equals(x5)){
            System.out.println("Same same");
        }
        else{
            System.out.println("but different");
        }
        /* here we checked for the value rather than the memory reference
        in case of primitive data types the answer will be same same doesnot matter if we use .equals() or ==
         */

    }
}
