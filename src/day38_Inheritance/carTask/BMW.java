package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void racingCar(){
        System.out.println(brand+" "+model+" is a racing car");
    }

    public void start() {
        System.out.println("jump start");
    }




}
