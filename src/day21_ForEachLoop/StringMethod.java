package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String str = "java";
        for (char each : str.toCharArray()) {   // str is not array  but tochararray return array .
            System.out.println(each);  // get each character .
        }
        System.out.println("==================================");

        String word = "mustafa";
        char[] chars = word.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println("==================================");

        String sentence = "wooden spoon";

        String [] s1 =sentence.split(" ");
        System.out.println(Arrays.toString(s1));

        String email = "woodenspoon@gmail.com";
        String [] e1 = email.split("@");
        System.out.println(Arrays.toString(e1));












    }
}
