package day15_ForLoop;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        /*
        3. write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275
         */
        System.out.println("enter the number");

        int number = new Scanner(System.in).nextInt(); // short cut of scanner scan = new ......
        if (number<0){                                  // set a condition
            System.out.println("Invalid number");
        }else {
            int sum = 0 ;                       //  give a variable sum
            for (int i = 0; i <=number ; i++) { //   repeat untill the given number .  then add all the number as sum.
                sum +=i;
            }
            System.out.println(sum);

        }












    }
}
