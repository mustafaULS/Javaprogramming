package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Mustafa114@";
        boolean r1 = password.length() >= 8 && !password.contains(" ");

        //set the rest boolean false. use loop for every element. then if its true.become true.
        boolean r2 = false;//has uppercase
        boolean r3 = false;//has lowercase
        boolean r4 = false;//has special char
        boolean r5 = false;// has digit

        char[] chars = password.toCharArray(); // make string to char array.

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }
        }

        boolean strongPassword = r1 & r2 & r3 & r4 & r5;
        System.out.println("strongPassword = " + strongPassword);


    }

    public static boolean strongPassword(String password) {

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        //set the rest boolean false. use loop for every element. then if its true.become true.
        boolean r2 = false;//has uppercase
        boolean r3 = false;//has lowercase
        boolean r4 = false;//has special char
        boolean r5 = false;// has digit

        char[] chars = password.toCharArray(); // make string to char array.

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }
        }

        boolean strongPassword = r1 & r2 & r3 & r4 & r5;
        return strongPassword;

    }


}
/*
strong password.
1.8 character not space
2.uppercase
3.lower case
4.special char
5.digit
 */
