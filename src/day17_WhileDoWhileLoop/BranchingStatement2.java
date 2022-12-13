package day17_WhileDoWhileLoop;

import java.sql.SQLOutput;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'F'; i++) {

            if (i=='C'){     // when i == c  true
                continue;  // skipping .
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");
        //print all odd number 1-10
        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();

        //print all even number 1-10

        for (int i = 1; i <=10 ; i++) {
            if (!(i%2==0)){
                continue;
            }
            System.out.print(i);
        }





    }
}
