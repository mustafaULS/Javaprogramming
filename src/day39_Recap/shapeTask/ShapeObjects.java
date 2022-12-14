package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square1 = new Square(10);

        System.out.println(square1);

        square1.setSide(20);

        System.out.println(square1);

        System.out.println(square1.getName());

        System.out.println("------------------------------------------");

        Rectangle rectangle1 = new Rectangle(5,6);

        System.out.println(rectangle1);
        rectangle1.setWidth(10);
        rectangle1.setLength(20);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1);


        System.out.println("------------------------------------------");

        Circle circle1 = new Circle(8);
        System.out.println(circle1);
        circle1.setRadius(10);
        System.out.println(circle1.getName());
        System.out.println(circle1.getRadius());
        System.out.println(circle1);








    }



}
