package day22_MultiDimensionalArray;

public class ReverseSecondWord2 {

    public static void main(String[] args) {


        String sentence ="i love java";
        //                  reverse love .
        String [] word=sentence.split(" "); // first get every string as array .
        String reverse="";                  // store the reverse.

        for (int i = word[1].length() - 1; i >= 0; i--) { // array index 1's  index reverse . love
            reverse+=word[1].charAt(i);         // love reverse every character
        }
        System.out.println(reverse);
        sentence=sentence.replaceFirst(word[1],reverse );
        System.out.println(sentence);



    }
}
