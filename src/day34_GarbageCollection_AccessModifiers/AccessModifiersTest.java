package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicDate);

        System.out.println(AccessModifiers.defaultDate);

    //    System.out.println(AccessModifiers.privateDate);// private is not visible outside the class.


        AccessModifiers.method();
        AccessModifiers.method2();
       //  AccessModifiers.method3();// private class




    }


}
