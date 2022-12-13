package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }


    static { // run first and only run once.
        System.out.println("static block");
    }


}
