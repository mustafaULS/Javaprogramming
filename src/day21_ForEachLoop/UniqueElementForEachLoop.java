package day21_ForEachLoop;

public class UniqueElementForEachLoop {

    public static void main(String[] args) {

        String[] words = {"java", "java", "python", "c#", "python"};

        for (String each : words) {  // get me each element

            int count = 0;
            for (String element : words) {  // compare
                if (element.equals(each)){
                    count++;
                }
        }
            if (count==1){
                System.out.println(each);
            }

        }









    }
}
