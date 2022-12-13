package day15_ForLoop;

import java.sql.SQLOutput;

public class StringMethod {

    public static void main(String[] args) {

        String str = "";

        boolean r = str.isEmpty(); // empty is nothing,  space is not empty

        System.out.println(r);

        String str2 = " ";

        boolean r2 = str2.isBlank(); // blank is no character .  space is blank.

        System.out.println(r2);

        // space is empty but not blank.

        System.out.println("============================================");

        String s1 = "CYDEO";
        String s2 = "cydeo";    //      equal  and equal ignore.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("======================================");

        String sentence = " my favorite programming language is Java";
        boolean hasCsharp = sentence.contains("C#");
        System.out.println(hasCsharp);
        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);
        boolean hasJava2 = sentence.contains("java"); //  contain cant ignore case .
        System.out.println(hasJava2);
        boolean hasJava3 = sentence.toLowerCase().contains("java"); // first make sentence to lower or upper case then find contain
        System.out.println(hasJava3);
        System.out.println("=================================================");

//          contain ....

        String input1 = "i love JAVA";
        String input2 = " Java";
        System.out.println(input1.equals(input2));// false.
        System.out.println(input1.equalsIgnoreCase(input2));// false

        System.out.println(input1.contains(input2));// true.
        System.out.println(input1.toLowerCase().contains(input2.toLowerCase()));// true
        System.out.println(input1.toLowerCase().contains(input2)); // false   becoz input2 J is upper case.

        System.out.println("========================================");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        System.out.println(x); // true

        boolean y = a.toLowerCase().startsWith("wooden");
        //    in order to ignore case sensitivity we first create upper case or lower case of string.
        System.out.println(y);

        boolean z = a.endsWith("Spoon");
        System.out.println(z); // true .




    }
}
