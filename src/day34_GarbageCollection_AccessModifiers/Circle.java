package day34_GarbageCollection_AccessModifiers;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

     public Circle (double radius){
         this.radius=radius;
        //  pi=3.14;  dont set constructor to static. if circle called 5 times.pi will ben called 5 times.no need.
     }

     static {
          pi = 3.14;
          name="circle";
     }




}
