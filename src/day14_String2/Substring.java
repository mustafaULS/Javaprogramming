package day14_String2;

public class Substring {

    public static void main(String[] args) {


        String str = "java is fun, java is cool, i love java";
//                    01234567890123456789

        String s1 = str.substring(0,str.indexOf(","));
        System.out.println("s1 = " + s1);
        String s2 = str.substring(str.indexOf(" j"),str.lastIndexOf(","));
        s2=s2.trim(); // just kidding.
        System.out.println("s2 = " + s2);
        String s3 = str.substring(str.lastIndexOf("i"));
        System.out.println("s3 = " + s3);



    }
}
