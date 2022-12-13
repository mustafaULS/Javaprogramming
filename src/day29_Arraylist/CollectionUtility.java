package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        // sort method :
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,5,8,9,9,7,6,5,3,5,7,8,9));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------------------------------------");

        //reverse method:

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','Q','W','E'));
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("---------------------------------------------");

        //swap method :

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
        System.out.println(list3);
        Collections.swap(list3,2,5);
        System.out.println(list3);


        System.out.println("---------------------------------------------");

        //max method  , min method:

       int max= Collections.max(list3);
        System.out.println("max = " + max);
        int min = Collections.min(list3);
        System.out.println("min = " + min);

        System.out.println("---------------------------------------------");

        // replaceALL method
        ArrayList<Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,30,20,50,60,80,80));
        System.out.println(list4);
        Collections.replaceAll(list4,20,200);
        System.out.println(list4);

        System.out.println("---------------------------------------------");

        //frequency method

        int fre = Collections.frequency(list4,200);
        System.out.println("fre = " + fre);

        System.out.println("---------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("java","python","c++","python","java"));

        int countJava= Collections.frequency(words,"java");
        int countPython = Collections.frequency(words,"python");
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);







    }
}
