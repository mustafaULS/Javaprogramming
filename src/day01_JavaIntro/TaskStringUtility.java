package day01_JavaIntro;

import utilities.StringUtility;

public class TaskStringUtility {

    public static void main(String[] args) {

        String str = "wooden spoon";

        StringUtility.printEachChar(str);
        System.out.println("-----------------");

        String reverse=StringUtility.reverse(str);
        System.out.println("reverse = " + reverse);
        System.out.println("-----------------");

        String word = "level";
        boolean palindrome = StringUtility.IsPalindrome(word);
        System.out.println(palindrome);
        System.out.println("-----------------");

        String [] name= {"anna","java","python","racecar","mom","cydeo"};
        int count = 0;
        for (String each : name) {
            if (StringUtility.IsPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-----------------");


        String str1="asdasdasdasdasd";
        str1=StringUtility.removeDuplicates(str1);
        System.out.println(str1);




    }
}
/* how to import a class
solution 1 :after package import package name and .class name.
and give class name +  . + method name.

solution 2 : directly write class name.

 */

