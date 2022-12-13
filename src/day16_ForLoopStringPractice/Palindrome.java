package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        // to know a word is palindrome  first we have to reverse the word. then to bijiao .

        String word = "level";

        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);
        }

        boolean ispalindrome = word.equalsIgnoreCase(reverse);
        System.out.println(ispalindrome);



    }
}
