package day04_variables;

public class circle {

    public static void main(String[] args) {


        //			PI, radius, diameter, area, perimeter
        double PI = 3.14;
        double radius = 3.5;
        double area = radius * radius * PI;
        double diameter = radius * 2;
        double permeter = diameter * PI;

   System.out.println(PI);
   System.out.println(radius);
   System.out.println(diameter);
   System.out.println(area);
   System.out.println(permeter);
        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("permeter = " + permeter);

    }

}
/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter
					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = diameter * PI
 */