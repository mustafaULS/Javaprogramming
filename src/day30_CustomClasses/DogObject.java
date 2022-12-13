package day30_CustomClasses;

import java.util.ArrayList;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.name="lucy";
        dog1.breed="husky";
        dog1.age=3;
        dog1.gender='F';
        dog1.size="small";
        dog1.color="White";

        System.out.println(dog1); // if give you hash code that's mean toString method NOT be generated.


        Dog dog2 = new Dog();
        dog2.name="Ace";
        dog2.breed="husky";
        dog2.age=3;
        dog2.gender='M';
        dog2.size="large";
        dog2.color="black";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("luna","german shepard",2,'M',"large","black");
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("mokoko","chiwawa",4,'F',"large","PINK");

        Dog dog5 = new Dog();
        dog5.setInfo("PICO","PUG",2,'M',"SMALL","tend");


        System.out.println("-----------------------------------------------------");


        
        Dog[] dogs={dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>();



        ArrayList<Dog> maleDogs = new ArrayList<>();


        dog1.eat();
        dog2.bark();




    }
}
