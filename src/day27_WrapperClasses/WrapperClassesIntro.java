package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {


        int num1 = 200;
        Integer n1 = num1; // auto boxing.  primitive to wrapper class

        int num2 = n1; // unboxing.  wrapper class to primitive

        System.out.println("-------------------------------------");

        Integer integerValue=100;
        long l1=integerValue;    // as long as in the range.

        System.out.println("-------------------------------------");

        int num3=200;
      //  Long L2=num3;  primitive can only converted to corresponding type.
        Integer num4 = num3; //auto boxing .

        System.out.println("-------------------------------------");

        int[] number1 ={1,2,3,4,5};
        Integer[] number2={1,2,3,4,5};
        // other structure may use wrapper class.




    }



}
