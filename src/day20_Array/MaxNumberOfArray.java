package day20_Array;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] number = {10, 5, 4, 20, 1, 0};
        int max = number[0]; //   jia she

        for (int i = 0; i < number.length; i++) { // i is index number .

            if (number[i] > max) { // if i index number   dui ying de number greater than current max
                max = number[i]; // re-assign the number as max.
            }
        }
        System.out.println(max);


    }
}
