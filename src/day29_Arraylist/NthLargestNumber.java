package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));


        //list.removeIf( p -> Collections.max(list)==p );// remove the max 1 time get the second max number.
        //list.removeIf( p -> Collections.max(list)==p );// remove the max 2 time get the third max number.
        // so this process can be repeated . make it loop.

        int n = 2; // Nth number . write which max number you want .

        for (int i = 1; i <n ; i++) {
            list.removeIf( p -> Collections.max(list)==p );
        }


        int max =Collections.max(list);




        
        int min = Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------");




    }
}
