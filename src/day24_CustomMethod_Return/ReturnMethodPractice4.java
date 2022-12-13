package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str = "aasdasdasdasdadsasdasdasdasdasd";

       str= removeDuplicate(str);
        System.out.println("str = " + str);

    }

    //remove the duplicate .

    public static String removeDuplicate(String str) {  //aaadddsss.

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains(each + "")) {
                result += each;
            }

        }

        return result;
    }


}
