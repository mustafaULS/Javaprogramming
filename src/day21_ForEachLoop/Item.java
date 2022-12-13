package day21_ForEachLoop;

public class Item {

    public static void main(String[] args) {

        String[] name = {"mustafa", "sadam", "ersat", "ali", "sude"};
        int[] year = {32, 28, 31, 38, 21};
        double[] high = {186.5 , 175.5 , 186.5 , 180,5, 173,5};

        // they all have same length . so i is same.
        // getting each element. then concatenation.

        for (int i = 0; i < name.length; i++) {
            String name1 = name[i];
            int year1 = year[i];
            double high1 = high[i];
            System.out.println("name: "+name1+" year: "+year1+" high: "+high1);

        }


    }
}
