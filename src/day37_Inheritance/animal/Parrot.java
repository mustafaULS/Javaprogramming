package day37_Inheritance.animal;

public class Parrot extends Animal{

    public String parrotWingColor;
    // if there is any unique instance  variable you need to add .  added this way


    public Parrot(String name, String breed, char gender, int age, String size, String color, String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

}
