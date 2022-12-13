package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("max","husky",'M',8,"large","white");
        dog1.eat();
        dog1.drink();
        dog1.move();
        dog1.sleep();
        dog1.bark();
        System.out.println(dog1);



        Cat cat1 = new Cat();
       // cat1.setInfo();
        cat1.eat();
        cat1.drink();
        cat1.sleep();
        cat1.move();
        cat1.meow();





        Tiger tiger1 = new Tiger();
        //tiger1.setInfo();
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.move();
        tiger1.roar();







    }




}
