package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {
// uniq task

        String str = "aaabbssbbddmasd";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
        }


    }


    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;

    }

}
