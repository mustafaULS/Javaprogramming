package day37_Inheritance.phoneTask;

public class Phone {

    public String breed;
    public String model;
    public String size;
    public double price;
    public String color;


    public static boolean hasBattery=true;

    public Phone(String breed, String model, String size, double price, String color) {
        this.breed = breed;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(breed +" "+ model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(breed +" "+ model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "breed='" + breed + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }




/*
    static { // if its more then one step to verify, use static block. or you can assign directly.
        hasBattery=true;
    }
 */











}
