package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicDate = 100;

    static int defaultDate=200;

    private static int privateDate=300;



    public static void method(){
        System.out.println("public");
    }

    static void method2(){
        System.out.println("default ");
    }

    private static void method3(){
        System.out.println("private");
    }







    public static void main(String[] args) {

        System.out.println(publicDate);
        System.out.println(defaultDate);
        System.out.println(privateDate);






    }













}
