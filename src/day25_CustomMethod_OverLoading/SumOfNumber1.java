package day25_CustomMethod_OverLoading;

public class SumOfNumber1 {

    public static void main(String[] args) {
        int sum = sumOf2Numbers(10, 20);
        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(10, 20, 30);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(10, 20, 30, 40);
        System.out.println("sum3 = " + sum3);


    }

    public static int sumOf2Numbers(int num1, int num2) {            //  () must have info.
        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}
/*
1 task:
find the sum of 2 number.
2 task:
find the sum of 3 number
3 task :
find the sum of 4 numbers
 */
