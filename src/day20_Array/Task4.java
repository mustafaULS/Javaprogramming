package day20_Array;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < grades.length; i++) {

            int score = scores[i];
            if(score >= 90){
                grades[i] = 'A';
            }else if(score >= 80){
                grades[i] = 'B';
            }else if(score >= 70){
                grades[i] = 'C';
            }else if(score >= 60){
                grades[i] = 'D';
            }else{
                grades[i] = 'F';
            }

            System.out.println(names[i] + "'s scores is " + scores[i] + " , " + "and grade is " + grades[i]);
            }







        }
    }


