package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        score must be between 0 -- 100.
        score must be valid
         */


        int score = 50;
        String result = "";
        if (score >= 0 && score <= 100) {// if the score is valid. we have 5 possibilities.

            if (score >= 90) {
                result = "excellent";
            } else if (score >= 80) {
                result = "great";
            } else if (score >= 70) {
                result = "good";
            } else if (score >= 60) {
                result = "passed";
            } else {
                result = "failed";
            }

        } else {//if score is not valid
            result = "Invalid score";

        }
        System.out.println(result);

    }
}
