package day23_customMethod;

public class CustomMethodWithParameters {

    public static void main(String[] args) {
        oddEvenNumber(123); //  demainds addition info to completed.

        ageOfPerson(31);
        printNumber(10,20);
    }

    public static void oddEvenNumber(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number .");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("you age is " + age);


    }



    public static void printNumber(int x,int y){

        for (int i = x; i <=y; i++) {
            System.out.print(i+" ");
        }




    }
}
