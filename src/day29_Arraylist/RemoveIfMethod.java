package day29_Arraylist;

import utilities.StringUtility;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 !=0){ // remove odd number
                list.remove(i);         // cant remove clean
            }
        }

         */

        list.removeIf(p -> p < 5); // Lambda expression


        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
         list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list2);
         list2.removeIf( p -> p % 2 ==0);
        System.out.println(list2);

        System.out.println("-----------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("java","python","javascrip","c++","java","java"));
        System.out.println(list3);

        list3.removeIf( p -> p.startsWith("j") );
        System.out.println(list3);

        System.out.println("-----------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("anna","racecar","level","eye","java","python"));
        System.out.println(names);

        names.removeIf( name -> StringUtility.IsPalindrome(name)); //

        System.out.println(names);









    }
}
