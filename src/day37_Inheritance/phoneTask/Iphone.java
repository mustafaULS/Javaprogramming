package day37_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone(String model, String size, double price, String color) {// ask info
        super("APPLE", model, size, price, color); // sign info
    }


    public void faceTime(long phoneNumber){
        System.out.println(breed+" "+ model+" is having facetime with "+phoneNumber);
    }


    public void faceTime(String email){ // method over loading
        System.out.println(breed+" "+ model+" is having facetime with "+email);
    }




}
