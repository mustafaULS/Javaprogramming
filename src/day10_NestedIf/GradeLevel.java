package day10_NestedIf;

public class GradeLevel {

    public static void main(String[] args) {

   // ternaries class

        byte gradeLevel = 18;
        String result = (gradeLevel>=1&&gradeLevel<=18)?(gradeLevel<=5)?"elementary school"
                :(gradeLevel<=8)? "middle school":(gradeLevel<=12)?"high school"
                :( gradeLevel<=16)?"College" :"grad school":"Invalid number";

        System.out.println(result);


        /*
        byte number = 8;
        String result1 = "";
        if (number >= 1 && number <= 18) {
            if (number <= 5) {
                result1 = "Elementary school";
            } else if (number <= 8) {
                result1 = "Middle school";
            } else if (number <= 12) {
                result1 = "High school";
            } else if (number <= 16) {
                result1 = "College";
            } else {
                result1 = "grad school";
            }
        } else {
            System.out.println("invalid number");
        }
        System.out.println(result1);

         */
    }
}


                /*
                1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
                 */