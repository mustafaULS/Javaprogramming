package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;// or * to call all the static variable

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(pi); // after import static member you can call directly.

    }



}
