package day15_ForLoop;

public class Task8 {

    public static void main(String[] args) {

        /*
        8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
         */

        String result = "";

        String str = "java";

        for (int i = str.length()-1; i>=0 ; i--) {
            result +=str.charAt(i);
        }

        System.out.println(str);
        System.out.println(result);

        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);


    }
}
