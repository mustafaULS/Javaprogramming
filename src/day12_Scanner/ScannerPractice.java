package day12_Scanner;

import java.util.Scanner;  //  java.util.* = wild import= import everything in util class, scanner just one of them

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);// short cut for import java.util.scanner.

        System.out.println("enter the number 1-7");

         int number =scan.nextInt();

         String result  ;

         if (number>=1 && number<=7){

            result =  (number==1)?"monday":(number==2)?"tuesday":(number==3)?"wednesday":(number==4)?"thursday"
                     :(number==5)?"friday":(number==6)?"saturday":"sunday";

         }else {
             result="Invalid number";
         }
        System.out.println(result);

         scan.close();//once you close  cant use again. has to open new object.



    }
}
