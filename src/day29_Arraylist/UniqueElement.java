package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,2,3,5,6,5,4,5,6,7,8,9,0,9,8,7,6));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list1) {
           int frequency = Collections.frequency(list1,each);//frequency of each element

           if (frequency==1){
               unique.add(each);
           }
        }

        System.out.println("unique = " + unique);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,2,3,5,6,5,4,5,6,7,8,9,0,9,8,7,6));

        ArrayList<Integer> unique1 = new ArrayList<>(list2);

        unique1.removeIf( p -> Collections.frequency(list2,p)>1);
        System.out.println("unique1 = " + unique1);

        System.out.println("-------------------------------------------------");



    }
}
