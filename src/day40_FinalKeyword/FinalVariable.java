package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay; // instance variable call throw from object

    final static String name;

    static {  // static call throw from class
        name = "ali";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }




    public static void main(String[] args) {

        final double pi = 3.14;

        // final variable is unchangeable .
        // it is constant

       final String name ;
        name = "ali";

       //  name ="ahmet"; cant assign again.


        FinalVariable obj= new FinalVariable("nov/04");

        System.out.println(obj.birthDay);

        System.out.println(name);







    }



}
