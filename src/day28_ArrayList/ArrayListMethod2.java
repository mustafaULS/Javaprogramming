package day28_ArrayList;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class ArrayListMethod2 {

    public static void main(String[] args) {

        // remove method :
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(200);
        list.add(500);
        list.add(200);
        System.out.println(list);

        /*
        int num =1;           primitive num = 1; as index number .
         list.remove(num);
       System.out.println(list);
                */

        Integer num = 300; // non primitive INTEGER num =200 is element .
        boolean n1 =list.remove(num); // return type boolean
        System.out.println(list);
        System.out.println(n1);

        // only remove one of element .

        System.out.println("------------------------------------------");

        //clear : remove everything
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("------------------------------------------");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A');//4
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------------------");

        //contains ();

       boolean m1= characters.contains('A');
        System.out.println(m1);

        Boolean m2 = characters.contains('Z');
        System.out.println(m2);

        System.out.println("------------------------------------------");

        // equals ();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2); //false
        System.out.println(list1.equals(list2)); //true


        System.out.println("------------------------------------------");
        // is empty ();

        boolean t1 = list1.isEmpty();  //
        System.out.println(t1);


        System.out.println("------------------------------------------");









    }


}
