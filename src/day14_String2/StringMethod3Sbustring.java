package day14_String2;

public class StringMethod3Sbustring {

    public static void main(String[] args) {

        //substring.

        String word = "cydeo school";
        //             0123456789
        String band = word.substring(0, 5); // not including the last number  so have to add 1 instead,
        System.out.println("band = " + band);

        String word2 = word.substring(6);// begin from some point to the end you dont need to give end number .
        System.out.println("word2 = " + word2);


        String result = "java programming language";  // this code use for any case that similar to this format.
        //
        String s1 = result.substring(0, result.indexOf(" "));

        String s2=result.substring(result.indexOf(" ")+1 , result.lastIndexOf(" "));

        String s3=result.substring(result.lastIndexOf(" ")+1); // you dont need give end of number .


        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);





    }
}
