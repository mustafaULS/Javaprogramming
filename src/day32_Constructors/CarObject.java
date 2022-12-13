package day32_Constructors;

public class CarObject {

    public static void main(String[] args) {

        Car car1= new Car("BMW");
        Car car2= new Car("BMW","M8");
        Car car3= new Car("BMW","M8",2022);
        Car car4= new Car("BMW","M8",2022,200000);
        Car car5= new Car("BMW","M8",2022,200000,"black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }





}
