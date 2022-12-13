package day14_String2;

public class StringMethod1 {

    public static void main(String[] args) {

        String str = "      mustafa   ulusoy     ";

        str = str.trim();     //  removed white space. front and back.

        System.out.println(str);


        String str2 = "cydeo school";
//                     0123456789012
       int n1= str2.indexOf("h");// find index number of context
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ol");  // if it has same character make it unique like " ool"
        System.out.println("n2 = " + n2);

        String str3 = "java programming language";
        int n3 = str3.indexOf("amm");    // make it unique .
        System.out.println("n3 = " + n3);

        int n4= str3.indexOf("g "); // write the character and following 2 or 3 context.
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("a"); // last index number from right. to find first  a .
        System.out.println("n5 = " + n5);

        String s = "java nova cava wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a c");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);





    }
}
