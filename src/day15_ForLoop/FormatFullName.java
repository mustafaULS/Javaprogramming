package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";
                                                // if use charAt that return us char   we cant use .uppercase
         firstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();// Cydeo.
        //              choose first character  then touppercase. concatenation rest of it , also to the lower case.

        System.out.println("firstName = " + firstName);


        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("lastName = " + lastName);

        System.out.println(firstName+" "+lastName);






    }
}
