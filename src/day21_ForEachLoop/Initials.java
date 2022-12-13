package day21_ForEachLoop;

public class Initials { // suo xie

    public static void main(String[] args) {

        String [] name = { "mustafa ulusoy","sude koksal","ali bogra","sadam zeytin","kurt adam"};


        for (String each : name) {
            String initials = each.charAt(0)+" "+each.charAt( each.indexOf(" ")+1    );
            System.out.println(initials);
        }



    }
}
