package day10_NestedIf;

public class NameOfMonth2 {


    public static void main(String[] args) {
        int month = 11;
        String rusult = month == 1 ? "jan" : month == 2 ? "feb" : (month == 3) ? "mar" : (month == 4) ? "apr"
                : (month == 5) ? "may" : (month == 6) ? "jun" : (month == 7) ? "jul" : (month == 8) ? "agu" : (month == 9) ? "sep"
                : (month == 10) ? "oct" : (month == 11) ? "nov" : "dec";
        System.out.println(rusult);

        // you can delete the parentheses. but for readable recommend to use parentheses.

    }
}
