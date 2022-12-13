package day20_Array;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int [] number = {90,23,40,30,50,20};
        int min=number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i]<min){
                min=number[i];
            }

        }
        System.out.println(min);








    }
}
