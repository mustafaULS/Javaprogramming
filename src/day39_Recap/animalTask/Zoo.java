package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Tiger tiger1 = new Tiger("dongdong","dongbei",'M',3,"large","orange",true,false,false );

        tiger1.hunt();
        tiger1.getAge();
        tiger1.drink();
        tiger1.eat();


        System.out.println("-----------------------------------------------");



        Bear bear1 = new Bear("rusrus","russun bear",'F',8,"huge","brown",true,false,true);

        bear1.hunt();
        bear1.getAge();
        bear1.getColor();
        bear1.eat();


        System.out.println("-----------------------------------------------");


        Dog dog1 = new Dog("piko","husky",'M',3,"small","white",false,true,true);

        dog1.eat();
        dog1.isFriendly();
        dog1.isPlayable();
        dog1.pet();

        System.out.println("-----------------------------------------------");


        Eagle eagle1 = new Eagle("KHABIB","russan eagle",'M',10,"large","black",true,true,true);
        eagle1.fly();
        eagle1.hunt();
        eagle1.getBreed();
        eagle1.getSize();

        System.out.println("-----------------------------------------------");

        Cat cat1 = new Cat("mimi","brithsh",'F',4,"small","grey",false,true,true);
        cat1.meow();
        cat1.scratch();
        cat1.eat();
        cat1.getName();
        cat1.isFriendly();
        cat1.isWild();
        cat1.getColor();





    }




}
