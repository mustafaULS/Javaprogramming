package day27_WrapperClasses;

public class Task3 {


    public static void main(String[] args) {

        String str = "wooden spoon123";
        String letters="";
        String digits="";
        String specailChars="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isLetter(each)){
                letters+=each;
            } else if (Character.isDigit(each)) {
                digits+=each;
            }else {
                specailChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specailChars = " + specailChars);

    }

}
/*
3. Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";
 */