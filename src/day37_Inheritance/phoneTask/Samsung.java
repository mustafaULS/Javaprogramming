package day37_Inheritance.phoneTask;

public class Samsung extends Phone{


    public Samsung(String model, String size, double price, String color) {
        super("samsung", model, size, price, color);
    }


    public void freezing(){
        System.out.println(breed+" "+model+" is freezing");
    }





}
