package day15_ForLoop;

public class Task2 {

    public static void main(String[] args) {

        /*
        2. Write a program that can return the sum of odd numbers between 1
to 100
         */
        int total = 0;

        for (int i = 1; i <= 100; i ++) {
            if (i%2!=0){
                total+=i;
            }
        }
        System.out.println(total);


    }
}
