package day37_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, double price, String color) {
        super("nokia", model, size, price, color);
    }


    public void selfDefense(){
        System.out.println("you can use "+breed+" "+model+" as self defense tool");
    }





}
