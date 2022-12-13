package day20_Array;

public class AppearedTwice {

    public static void main(String[] args) {

        char[] chars ={'a','b','d','a','s','e','a','a','d','s'};

        for (int j = 0; j < chars.length; j++) {

            char ch = chars[j];// a
            int frequency = 0;

            for (int i = 0; i < chars.length; i++) {

                if (chars[i]==ch){
                    frequency++;
                }
            }
            if (frequency==2){
                System.out.println(ch);
            }
        }







    }
}
