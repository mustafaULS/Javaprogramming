package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch ='A';
        switch (ch){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("pass");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("Invalid");
        }






    }
}
