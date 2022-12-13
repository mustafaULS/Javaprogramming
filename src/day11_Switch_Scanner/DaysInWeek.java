package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5 ;//1,2,3,4,5,6,7 day
        switch (number) {//   switch only use "=="  other cant use.> >= ..... cant
            case 1:
                System.out.println("monday");
                break;// exits the switch after executing the case block.
            case 2:
                System.out.println("tuesday");
                break;// exits the switch after executing the case block.
            case 3:
                System.out.println("wednesday");
                break;// exits the switch after executing the case block.
            case 4:
                System.out.println("thursday");
                break;// exits the switch after executing the case block.
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;//optional  because already reaching close curly braces,its last block.
            // only executing if none of the case block are matching.  you can put default anywhere . recommend the last block
            // if you put before the case you have to write break .
            //case you can have more  but default only have one .
        }

    }
}
