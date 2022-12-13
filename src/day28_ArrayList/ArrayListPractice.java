package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();// cant use int , use non primitive.
        number.add(10);//add() convert int to non-primitive  10 is int, here auto boxing
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number);

            //number=[10, 20, 30, 40, 50]

        for (int i = 0; i < number.size(); i++) {
            number.set(i,number.get(i)*2 );// i is each index number . get() get each element *2.
        }
        System.out.println(number);


    }


}
/*
{1,2,3,4,5,6}
*2

 */
