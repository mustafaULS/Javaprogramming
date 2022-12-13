package day11_Switch_Scanner;

import java.util.Scanner;//

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //4. and if you want to write anything string before the Input. just before the Input its ok
        System.out.println(" Enter an integer.");
        int number1 = keyboard.nextInt();
        // 1.write a integer ,and  waiting user to put value.
        // 2. if you want ot re-use the Input you can declare as variable.
        // 3. because you are expecting user to put in an Integer number. you declare variable as int.

        System.out.println(number1);
        System.out.println(" Enter a double");
        double number2 = keyboard.nextDouble();
        System.out.println(number2);
        System.out.println("multiplication = "+(number1 * number2));

        keyboard.close();
    }
}
