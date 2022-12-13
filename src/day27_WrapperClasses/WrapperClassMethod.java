package day27_WrapperClasses;

public class WrapperClassMethod {

    public static void main(String[] args) {

        String str = "123123";

        // parse : convert String to primitive.
        int num1 = Integer.parseInt(str);//  return int
        System.out.println(num1);

        String str1 = "12.12";
        double num2 = Double.parseDouble(str1);
        System.out.println(num2);

        System.out.println("-----------------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("-----------------------------");

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        System.out.println("-----------------------------");

        String s1 = "true";  // other then true everything will ben false.
        boolean m1 = Boolean.parseBoolean(s1);
        System.out.println(m1);

        System.out.println("-----------------------------");
        // value of   convert string to Wrapper class.
        String s2 = "123";
        Integer i1 = Integer.valueOf(s2);
        System.out.println(i1);

        String s3="12.1";
       double i2= Double.valueOf(s3);
        System.out.println(i2);

        System.out.println("-----------------------------");

        char ch1 = '0';

        //isdigit.
       boolean w1= Character.isDigit(ch1); // if its digit return true or false.
        System.out.println(w1);

        //isletter
        char ch2 = 'a';
       boolean w2= Character.isLetter(ch2);
        System.out.println(w2);

        //isdigitorisletter.

        char ch3 = '!';// specail.
       boolean w3= !Character.isLetterOrDigit(ch3); // if either letter or digit. its specail character.
        System.out.println(w3);

        //uppercase .
       boolean w4= Character.isUpperCase(ch2);
       boolean w5 = Character.isLowerCase(ch2);
        System.out.println("w4 = " + w4);
        System.out.println("w5 = " + w5);

        System.out.println("-----------------------------");

        String s = "abc1sdf2qwe3";

        int sum=0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(each+"");
            }
        }
        System.out.println("sum = " + sum);









    }
}
