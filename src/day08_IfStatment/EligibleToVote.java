package day08_IfStatment;

public class EligibleToVote {

    public static void main(String[] args) {
        int age = 30;
        String citizenShip = "USA";
        Boolean eligibleToVote = age >=18 && citizenShip == "USA";
        if (eligibleToVote){
            System.out.println(" is eligible");
        }
        if (!eligibleToVote){//!true ==  not true == false;
            System.out.println("is not eligible");
        }




    }
}
