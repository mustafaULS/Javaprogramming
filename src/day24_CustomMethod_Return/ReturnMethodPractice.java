package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    // find the max number between 100 , 200
    // and multiply by 2 .

    public static void main(String[] args) {
        // find the max number between 100 , 200
        int maxNumber=max(100,200);
        System.out.println(maxNumber);
        // and multiply by 2 .
        int multiply = maxNumber*2;
        System.out.println(multiply);

    }



    public static int max(int num1, int num2) {

        int max = 0;
        if (num1>num2){
            max=num1;
        }else {
            max=num2;
        }
        return max;

    }






}

