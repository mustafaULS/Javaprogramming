package day16_ForLoopStringPractice;

public class UniqueCharacter {

    public static void main(String[] args) {

        //to find unique character in string  you can use
        // indexof() and lastindexof().
        // indexof and lasindexof has to be same.   from front and from last  there will be same number.

        String str = "asdasdasdasdasdc";
        String result = "";

        for (int i = 0; i <str.length() ; i++) {    // or length-1 ,  i is index number from 0,  // first make the loop how many times you want to repeat.

           char ch= str.charAt(i);  //each of character of str .                                 //  second make every possibility clean, make number to the charm

            //System.out.println(ch); // just to showing the every character every possibility.

                if (str.indexOf(ch) == str.lastIndexOf(ch)) {                                   // third give condition.
                ; //  if the first and last  index number are same  its unique.
                result += ch;
            }

        }

        System.out.println(result);

    }

}
