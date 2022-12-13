package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        //calculate the grade .
        String str = grade(90);

        //check the grade . if a = excellent b = great . .....
        if (str.equalsIgnoreCase("A")){
            System.out.println("excellent");
        } else if (str.equalsIgnoreCase("B")) {
            System.out.println("great");
        }


    }


    public static String grade(int score) {
        String result = "";

        if (score < 0 || score > 100) {
            result = "invalid number";

        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" :
                    (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }

        return result;
    }


}
