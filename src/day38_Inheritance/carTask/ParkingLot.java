package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("camry",2022,80000,"white",12323);

        Tesla tesla1 = new Tesla("model S",2021,120000,"black",9090);

        BMW bmw1 = new BMW("M8",2022,250000,"BLACK",123);



        toyota1.start();
        tesla1.start();
        bmw1.start();



    }




}
