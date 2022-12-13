package day34_GarbageCollection_AccessModifiers;

import day30_CustomClasses.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        //     first way:
        String m = " mustafa";

        m = null;  // nulling the object  null only for non-primitive type

        System.out.println(m);


        //  second way :
        Dog dog1 = new Dog();// un referenced dog object
        dog1.name = "wow";    // line 22 took this name. he is no name dog.

        dog1 = new Dog();
        dog1.name = "haw";

        System.out.println("----------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("----------------------------------------------");






    }
}
