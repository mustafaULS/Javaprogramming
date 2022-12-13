package day15_ForLoop;

public class Task1 {

    public static void main(String[] args) {
        /*
        1. Write a program that can return the sum of even numbers between 1
to 100
         */




//                                  condition will be     2,4, 6,  8
        int sum = 0;// right now sum is 0, but it will be 2,6, 12, 20

        for (int i = 2; i <= 100; i++) {// for will not be influence by if.
            if (i%2==0){
                sum +=i;  //sum = sum+i;
            }

        }
        System.out.println(sum);
/*
for (int i = 2; i <= 100; i +=2) {   you can also start with 2,  jump every 2 number because its even number

                sum +=i;
            }

        }
 */

    }
}
