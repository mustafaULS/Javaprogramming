package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String [] words= {"java programming" , "cydeo school","wooden spoon" , "early birds","angry birds"};

        for (String each : words){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));

        }

    }
}

