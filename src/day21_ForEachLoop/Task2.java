package day21_ForEachLoop;

public class Task2 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int oddCount=0;
        int evenNumber=0;

        for (int each : a) {


            if (each % 2 == 0) {
                evenNumber++;
            }else {
                oddCount++;
            }


        }
        System.out.println(evenNumber);
        System.out.println(oddCount);




    }
}
/*
2. Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
 */