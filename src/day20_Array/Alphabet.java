package day20_Array;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26]; // z - a

        //         i   ch
        //alphabet[0]='Z';
        //alphabet[1]='Y';

        char ch = 'Z';

        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet)); // print whole arrays .
        //System.out.println(alphabet[0]); // print element of array. in this case is char.




        /* second solution

        for (char i = 0, j = 'Z'; i < alphabet.length; i++, j--) {

            alphabet[i] = j;
        }
        System.out.println(Arrays.toString(alphabet));

         */

    }
}
