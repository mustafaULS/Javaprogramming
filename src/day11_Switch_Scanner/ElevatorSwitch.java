package day11_Switch_Scanner;

public class ElevatorSwitch {

    public static void main(String[] args) {

        int floorNumber = 12;
        String result = "";
        switch (floorNumber){
            case 1:
                result="Floor 1\nselected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result="Floor 2\nselected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result="Floor 3 \nselected. Companies ,Lyft, BofA, Stake house";
                break;
            default:{
                result="Invalid Number";
            }
        }
        System.out.println(result);




    }
}
