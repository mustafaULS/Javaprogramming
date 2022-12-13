package day25_CustomMethod_OverLoading;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        int a = sumOfNumbers(10, 20, 30);
        System.out.println(a);
        double b = sumOfNumbers(2.5,3.5);
        System.out.println(b);
        int c = sumOfNumbers(10,20,30,40);
        System.out.println(c);
        // same name  different parameters. overloading

    }

    public static int sumOfNumbers(int num1, int num2) {            //  () must have info.
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    // you can re-use method in the method
    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }



}
