package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int [] number = {10,20,30,40,50,60};
        double sum = 0;

        for (int each : number) {
            sum+=each;
        }

        double average = sum/number.length;
        System.out.println(average);




    }
}
