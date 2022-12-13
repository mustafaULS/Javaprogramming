package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        // remove :  remove given array.
        // first convert array to the arraylist. remove element. assigned back to array.
        String [] country = {"japan","korea","united state","turkey","united kingdom","canada"};

        //convert array to arraylist :
        //non-primitive arrays  call asList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(country));

        list.removeIf( p -> p.length()>=10);
        System.out.println("list = " + list);

        // convert arraylist to array.
       country= list.toArray(new String[0]);

        System.out.println(Arrays.toString(country));






    }


}
/*
1.create array of string called country
2. write program that can remove all the country names that have length of 10 or greater .
 */