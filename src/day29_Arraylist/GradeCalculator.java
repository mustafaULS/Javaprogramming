package day29_Arraylist;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> score = new ArrayList<>();
        score.addAll(Arrays.asList(100,90,75,85,55,45,74,86,32,45,65,69));
        System.out.println("score = " + score);

        ArrayList<Integer> gradeOfA= new ArrayList<>(score); //90-100;
        gradeOfA.removeIf( p -> !(p>=90) );
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer> gradeOfB= new ArrayList<>(score); //80- 89;
        gradeOfB.removeIf( p -> !(p>=80 && p<90) );
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC= new ArrayList<>(score); //70- 79;
        gradeOfC.removeIf( p -> !(p>=70 && p<80) );
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD= new ArrayList<>(score); //60-69
        gradeOfD.removeIf( p -> !(p>=60 && p <70));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer> gradeOfF= new ArrayList<>(score); //60-69
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);

        System.out.println("total number of A :" + gradeOfA.size());
        System.out.println("total number of B :" + gradeOfB.size());
        System.out.println("total number of C :" + gradeOfC.size());
        System.out.println("total number of D :" + gradeOfD.size());
        System.out.println("total number of F :" + gradeOfF.size());


    }
}
