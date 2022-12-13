package day12_Scanner;

public class GradeLevelSwitch {
    public static void main(String[] args) {// if statement and switch statement mix.

        byte number = 4;
        String result = "";

        if (number >= 1 && number <= 18) {

            switch (number) {
                case 6: case 7: case 8:
                    result = "middle school";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "high school";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    result = "college";
                    break;
                case 17:
                case 18:
                    result = "grad school";
                    break;

                default:// means 1-5
                    result = "element school";
            }

        } else {
            result = "Invalid number";
        }
        System.out.println(result);





    }
}

/*

task is
1-5 elementary school
6-8
9-12
13-16
17-18   something like this
 */
