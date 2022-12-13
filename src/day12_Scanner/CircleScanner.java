package day12_Scanner;

import java.util.Scanner;

public class CircleScanner {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);               // first give a variable. input or scan.

        System.out.println("enter the radius of the circle");
              double r=  input.nextDouble();                  //then what do you expect user to write .

              //input.close();  you can close scanner from the last time you use it

              double area = r*r*3.14;
              double perimeter = 2*r*3.14;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        //input.close();// or close at the end. make sure you close.


    }
}
/*

ask user to put number radius
calculate
 */
