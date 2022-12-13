package day09_IfStatement;

public class NameOfDay {


    public static void main(String[] args) {


        int n = 2;
        String day;
        if (n==1){
           // System.out.println("pazartesi");
            day = "pazartesi";
        } else if (n==2) {
           // System.out.println("sali");
            day = " sali";
        } else if (n==3) {
           // System.out.println("carsembe");
            day = " carsembe";
        } else if (n==4) {
            //System.out.println("persembe");
            day = "persembe";
        } else if (n==5) {
            //System.out.println("cuma");
            day = " cuma";
        } else if (n==6) {
            //System.out.println("cumartesi");
            day = " cumartesi";
        }else {
           // System.out.println("pazar");
            day = "pazar";
        }
        System.out.println("day = " + day);;
    }
}
/*
you can write if, else if and else statement ..   also use one string  in the end you just print one string.
 */