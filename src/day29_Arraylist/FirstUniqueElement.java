package day29_Arraylist;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);

        System.out.println(list);

        for (Integer each : list) {
            int frequency = 0;
            for (Integer element : list) {
                if (element == each) {
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(each);
                break;
            }
        }


    }
}
/*
write a program return first unique element from array list.
do not use index of and last index of .
 */


