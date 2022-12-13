package utilities;

import java.util.Arrays;

public class StringUtility {

    // print each character of given string.
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverse the given string and return the reverse string.
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //check if the given string is palindrome,return boolean.
    public static boolean IsPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    //check if the given string is anagram, return boolean.
    public static boolean IsAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();  // for use sort we have to make the string array .
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    //remove the duplicate from given string, return string.
    public static String removeDuplicates(String str){
        String result= "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(each+"")){
                result+=each;
            }
        }
        return result;
    }

}


