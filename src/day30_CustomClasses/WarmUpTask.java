package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(number, 0, number.size() - 1);

        System.out.println(number);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 1, 0, 2, 0, 4, 0, 5, 6, 0)); // given arraylist
        System.out.println(list);

        int size = list.size(); // given array list size .

        list.removeAll(Arrays.asList(0));

        System.out.println(list);
        int newSize = list.size();
        int totalRemoveZero = size - newSize;
        System.out.println("totalRemoveZero = " + totalRemoveZero);

        for (int i = 0; i < totalRemoveZero; i++) {
            list.add(0);
        }

        System.out.println(list);


        System.out.println("---------------------------------------------------");
        //solution 2 :

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 0, 1, 0, 2, 0, 4, 0, 5, 6, 0)); // given arraylist

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list1) {
            if (each !=0){
                result.add(each);
            }
        }
        System.out.println(result);

        for (Integer each : list1) {
            if (each==0){
                result.add(each);

            }
        }
        System.out.println(result);


        System.out.println("---------------------------------------------------");

        String str = "ABCD123asd@#$%456ASDF";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);

        ArrayList<Character> letter = new ArrayList<>(chars);

        letter.removeIf( p-> !Character.isLetter(p)  );
        System.out.println("letter = " + letter);

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf( p ->!Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> special = new ArrayList<>(chars);
        //special.removeAll(letter);
        //special.removeAll(digits);
        special.removeIf( p -> Character.isLetterOrDigit(p));
        System.out.println("special = " + special);









    }
}
/*
1.swap first element to last one.
2.move all the o to the last.
3.extract letters digit, special character.
 */
