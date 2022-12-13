package day06_PrimitaiveTypeCastings;

public class ArithmeticPractice {

    public static void main(String[] args) {
        /*
        System.out.println("10/3) = in mathematics =3.3333  in java = 3
        integer / integer = integer
        you can do this    sout(10.0/3)  = 3.3   or sout(10d/3)
        or you can add d or D ...
        sout(10d/3)
        sout(10/3d)
         */


        int a = 100;
        double b = a / 6; //16.0    after 6 you can write d instead
        // double b = 16;
        // write d after integers,become double.
        System.out.println(b);

        double c = (double) a /6;    //16.66666

        System.out.println(c);
        System.out.println(10.0/3);
        System.out.println(10d/3);

    }
}
