package day16_ForLoopStringPractice;

public class RemovingDuplicate {

    public static void main(String[] args) {

        String str = " aabbcba";

        String result = "";                 // expect result abc

        for (int i = 0; i <= str.length()-1; i++) {
            String ch = "" + str.charAt(i); // so here we convert char to string by adding string space .
                // up here you get each  character, then each character will go in the if condition.

            if (!result.contains(ch)) { // here contains expect string .  if this statement is true will adding in result
                // here means if character is not contain in the result ,
                result += ch; //  the character will adding in the result.
            }

        }
        System.out.println(result);
    }
}
