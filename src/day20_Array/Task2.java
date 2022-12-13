package day20_Array;

public class Task2 {

    public static void main(String[] args) {


        String[] name = {"mustafa ulusoy", "sadam idris", "sude koksal", "ersat artus", "ali bogra"};

        for (String each : name) {

            String reverse = "";                            // mustafa ulusoy
            // 01234556789012
            for (int i = each.length() - 1; i >= 0; i--) {

                reverse += each.charAt(i);

            }
            System.out.println(reverse);


        }


    }
}
