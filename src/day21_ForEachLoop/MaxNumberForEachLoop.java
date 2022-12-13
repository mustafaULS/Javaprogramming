package day21_ForEachLoop;

public class MaxNumberForEachLoop {

    public static void main(String[] args) {

        int[] number = {10, 5, 4, 20, 1, 0};
        int max = number[0]; //   jia she

        for (int each : number) {
             if (each>max){
                 max = each;
             }
        }






    }
}
