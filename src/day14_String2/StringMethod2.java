package day14_String2;

public class StringMethod2 {

    public static void main(String[] args) {

        String email = "mustafa@hotmail.com";
       email= email.replace("hotmail","gmail"); //  replacement ,, replace all of them.
        System.out.println("email = " + email);

        String s = "dog dog dog dog dog dog dog";
        s= s.replace("dog","cat");
        System.out.println("s = " + s);

        String s2 = "c+ is fun , c+ is cool";
       s2= s2.replace(" c+"," java");
        System.out.println("s2 = " + s2);


        String s3 = "java";
        s3=s3.replace("a","e");// you can also change one character.
        System.out.println("s3 = " + s3);
        System.out.println("======================================");

        String result = "java java java";
        result=result.replaceFirst("java","python"); // replace the first match.
        System.out.println("result = " + result);

        String result2 = "java";
        result2= result2.replaceFirst("va","vo"); // if you wanna replace second a you type together  before or after second a .
        System.out.println("result2 = " + result2);






    }
}
