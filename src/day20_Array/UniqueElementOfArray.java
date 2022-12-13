package day20_Array;

public class UniqueElementOfArray {

    public static void main(String[] args) {

        String[] words = {"java", "java", "python", "c#", "python"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) { // find frequency of element from array
                if (words[i].equals(element)) {
                    frequency++;
                }

            }

            if (frequency == 1) {
                System.out.println(element);
            }
        }
    }
}
