package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {



        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("ahmet","james","kobe","david","ali","shay","jimmy"));

        employee.retainAll(Arrays.asList("ahmet","david"));

        System.out.println("employee = " + employee);


        System.out.println("-----------------------------------------------");

        String[] names = {"mary","mustafa","monica","mehmet","ulusoy","sude"};

        ArrayList<String> result = new ArrayList<>(Arrays.asList(names));

        result.removeIf( p ->  p.startsWith("m") );
        System.out.println("result = " + result);


       names =  result.toArray( new String[0]);
        System.out.println(Arrays.toString(names));




    }
}
