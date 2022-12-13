package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {


        String str = "cydeo1234schoold!@#$%WOodenspoon";

        String digits = "";
        String letters = "";
        String specailChars = "";

        for (int i = 0; i < str.length(); i++) {  // index number

            char ch = str.charAt(i);   // give you all the characters.


            if (ch >= '0' && ch <= '9') { // acsitable number . between 0 - 9 character .

                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {

                letters +=ch;
            }else {
                specailChars +=ch;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specailChars = " + specailChars);
    }
}
