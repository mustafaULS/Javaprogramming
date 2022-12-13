package utilities;

public class MathUtility {

    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    public static double sum(double num1, double num2) {
        return num1 + num2;

    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;

    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;

    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;

    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;

    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    //-----------------------------------------------------------------

    public static boolean evenNumber(int num1) {
        return (num1 % 2 == 0) ? true : false;
    }

    public static boolean oddNumber(int num1) {
        return (num1 % 2 != 0) ? true : false;
    }

    //-----------------------------------------------------------------

    public static int maxNumber(int num1,int num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static double maxNumber(double num1,double num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static int minNumber(int num1,int num2){
        if(num1>num2){
            return num2;
        }else {
            return num1;
        }
    }

    public static double minNumber(double num1,double num2){
        if(num1>num2){
            return num2;
        }else {
            return num1;
        }
    }

    //-----------------------------------------------------------------

    public static int square (int num){
        return num*num;
    }

    public static double square (double num){
        return num*num;
    }

    public static int cube (int num){
        return num*num*num;
    }

    public static double cube (double num){
        return num*num*num;
    }

    //-----------------------------------------------------------------




}
