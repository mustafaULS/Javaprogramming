package day23_customMethod;

public class Task5 {

    public static void main(String[] args) {

        grade(75);

    }

    public static void grade(int score){

        String result  =(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"E";
        System.out.println("grade is "+result);


    }
}
