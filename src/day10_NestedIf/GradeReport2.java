package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 0;
        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "excellent" : (score >= 80) ? "great" : (score >= 70) ? "good"
                : (score >= 60) ? "pass" : "failed"//this else is possibilities .
                : "Invalid score";//this is pre-condition else
        System.out.println(result);

        System.out.println("=======================================");

        /* can also be mix use...


        String result2 = "";
        if (score >= 0 && score <= 100) {
             result2 = (score >= 90) ? "excellent" : (score >= 80) ? "great" : (score >= 70) ? "good"
                    : (score >= 60) ? "pass":"failed";

        } else {result2="Invalid number";

        }
        System.out.println(result2);

         */


    }
}
