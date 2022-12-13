package day16_ForLoopStringPractice;

public class FrequencyOfWord {

    public static void main(String[] args) {


        String str = "java java java";

        int frequency = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            String eachChar = str.substring(i, i + 4);

            if (eachChar.equals("java")) {
                frequency++;
            }
        }
        System.out.println(frequency);


    }
}
