package day06_PrimitaiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {

        double a = 5.9;
        short b = (short) a;
        System.out.println(a + " : " + b);
//short only accept integer. so its 5

        float m = 8.9f;
        long n = (long) m;
        System.out.println(n);

        int oo = 888;  ///    right to left    "you dao zuo"
        byte o = 88;
       oo=o;
       o= (byte) oo;




    }
}
