package day11_Switch_Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        // 1--12 month

        int number = 19;

        switch (number){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("agu");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("Invalid number");

        }
    }
}
