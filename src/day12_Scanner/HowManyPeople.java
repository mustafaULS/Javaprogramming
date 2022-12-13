package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);

        System.out.println("how many people you live with ?");
        int number = scan.nextInt();
        if(number < 3){
            System.out.println("less then 3 people");
        } else if (number<=6) {
            System.out.println("Live with 3 - 6 people");
        }else {
            System.out.println("more then 6 people");
        }
        scan.close();




    }
}
