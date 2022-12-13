package day17_WhileDoWhileLoop;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "AAASSSDDDD";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i);   //convert char to string just add space.

            if (result.contains(ch)){
                continue;
            }
            result +=ch;


        }
        System.out.println(result);


    }
}
