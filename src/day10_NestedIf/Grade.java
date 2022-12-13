package day10_NestedIf;

public class Grade {
    public static void main(String[] arg) {

        char grade = 'D';
        String result="";
        if (grade>='A'&&grade<='F'){
            if (grade=='A'){
                result="excellent";
            } else if (grade=='B') {
                result="great job";
            } else if (grade=='C') {
                result="good";
            } else if (grade=='E') {
                result="passed";
            }else {
                result= "failed";
            }

        }else {
            result=" Invalid Number";
        }
        System.out.println(result);


    }
}
/*
3. Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */
