package day16_ForLoopStringPractice;

public class Reverse1 {

    public static void main(String[] args) {

        //reverse the string .
        String str = "hello everyone my name is mustafa";
        //index number  0123456789

        String result = "";             // output is string so create a string
        // adding back to result.

        /*
        result += str.charAt(11);       // last character n.  added to the result
        result += str.charAt(10);       //     adding last characters
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);
        System.out.println(result);

         */
                        // this code  is for any reverse string .

        for (int i = str.length() - 1; i >= 0; i--) {   // i is index number of str string.last index .

            result += str.charAt(i);  //  i is index number , to become character use charAt.

        }
        System.out.println(result);


    }
}
