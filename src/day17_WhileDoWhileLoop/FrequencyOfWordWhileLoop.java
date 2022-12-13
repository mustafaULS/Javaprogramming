package day17_WhileDoWhileLoop;

import java.util.IllegalFormatCodePointException;

public class FrequencyOfWordWhileLoop {

    public static void main(String[] args) {


        String str = "java java python python jav java javajavavajava";

        int frequency = 0;
        while (str.contains("java")){  // delete every time string contain java.
            str=str.replaceFirst("java","");
            frequency++;   // then knoning how many times to delete.
        }
        System.out.println(frequency);

        System.out.println("=====================================");

        String str2 ="cat cat cast cat dog dog dog cat cat";

        int countCat= 0;

        while (str2.contains("cat")){
            str2=str2.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);
        System.out.println("=====================================");

        // counting two words in one while.

        String s = "java java python java python python";

        int countJava= 0;
        int countPython= 0 ;

        while (s.contains("java")||s.contains("python")){

            if (s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;

            }

        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);










    }


}
