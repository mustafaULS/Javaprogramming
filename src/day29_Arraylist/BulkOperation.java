package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //addAll Method
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 4, 9));
        System.out.println("list = " + list);

        //removeALL  give element .
        list.removeAll(Arrays.asList(4, 7, 9));
        System.out.println("list = " + list);

        System.out.println("----------------------------------");

        //retainALL
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300));
        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(numbers);

        ArrayList<String> jobTitle = new ArrayList<>();
        jobTitle.addAll(Arrays.asList("QA", "SDET", "DEVELOPER", "QA", "SDET", "SCRUM MASTER", "BA"));
        jobTitle.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println("jobTitle = " + jobTitle);

        System.out.println("----------------------------------");

        ArrayList<Integer> s1 = new ArrayList<>();
        s1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4));
        boolean r1 = s1.contains(10);
        System.out.println(r1);

        boolean r2 = s1.containsAll(Arrays.asList(2, 10, 3));
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------------");


        // array to array list .
        String[] names = {"james", "jordan", "kobe", "drake"};

        //solution 1 :
        ArrayList<String> namelist1 = new ArrayList<>();
        namelist1.addAll(Arrays.asList(names)); // only for non primitive type.
        System.out.println("namelist1 = " + namelist1);


        //solution 2 :
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println("nameList = " + nameList);


        System.out.println("----------------------------------");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(arr));


        System.out.println("----------------------------------");

        int [ ] array= {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> m1 = new ArrayList<>(convertArrayToArrayList(array));
        System.out.println(m1);




    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;


    }


}
