package day08_IfStatment;

public class GradeReport {

    public static void main(String[] args) {

        int score = 69;
        boolean a = score>=90;
        boolean b= score>=80 && score<=89;// score >= 80 && !a;
        boolean c= score>=70 && score<=79;//score > 70 && !a && ! b;
        boolean d = score>=60 && score<=69;
        boolean f = score<=59;// !a && !b && !c && !d;


        if (a){
            System.out.println("excellent");
        }
        if (b){
            System.out.println("great");
        }

        if (c){
            System.out.println("good");
        }

        if (d){
            System.out.println("passed");
        }
        if (f){
            System.out.println("failed");
        }

        }
    }

