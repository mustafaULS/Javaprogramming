package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {

    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();
                        //index number:
        number.add(100);//0
        number.add(200);//1
        number.add(300);//2
        number.add(100);//3
        number.add(200);//4
        number.add(300);//5
        number.add(3,900);
        number.add(4,800);
        System.out.println("number = " + number);

        //  add(date): adds the date after last index of the arraylist.

        //  add (index,date) :  insert function. add middle. shift to the right .

        System.out.println("-----------------------------------------------");

        //size () : size of arrayList .   also we can find last index number .
        System.out.println(number.size());
        int lastIndex = number.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-----------------------------------------------");

        // get( index number ): return element of given index number.
        Integer n1= number.get(4); // wrapper class
        int n2 = number.get(4);// un boxing wrapper to primitive

        System.out.println("n2 = " + n2);

        System.out.println("-----------------------------------------------");

        for (int i = 0; i < number.size(); i++) {  // for loop for array list.
            System.out.println(number.get(i));//print every element .

        }

        System.out.println("-----------------------------------------------");

        //set(): replace element
        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("C#");
        list.add("ruby");
        list.add("java");
        list.set(4,"javaScript"); // replace
        list.set(2,"C++");              // replace
        System.out.println(list);

        System.out.println("-----------------------------------------------");

        //remove :remove the element from array list.
        // can write index or element. 2 way.

        ArrayList<String> employees= new ArrayList<>();
        employees.add("mustafa");
        employees.add("ahmet");
        employees.add("susan");
        employees.add("james");
        employees.add("mike");
        employees.add("jordan");
        employees.add("kobe");
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("james"); // removes object.
        System.out.println(employees);
        // also can be boolean.
         boolean w1 =employees.remove("jordan");
        System.out.println(w1);


        System.out.println("-----------------------------------------------");




    }




}

