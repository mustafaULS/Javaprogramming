package day13_String;


public class StringMethod {

    public static void main(String[] args) {

        String word = "cydeo"; // charAt counting number from 0/
//                     01234
        char thirdChar = word.charAt(3);
        System.out.println(thirdChar);

        //char tenthNumber = word.charAt(9);
        //zSystem.out.println("tenthNumber = " + tenthNumber);
        // if you out of range then error

        System.out.println("===============================");// length()  counting number from 1.

        String s1 = "whats your name bro .";
        int totalNumber = s1.length();  //       length ()-1
        System.out.println("totalNumber = " + totalNumber);

        char last = s1.charAt(s1.length()-1); // this is how you find your last character from length.

        System.out.println("last character = " + last);

        System.out.println("================================");

            String str = "wooden spoon"; // to upper case.  to lower case.  string is imitable.
           str= str.toUpperCase(); // you have to assigned back.  or it will not change.
        System.out.println(str);

    }
}
