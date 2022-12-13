package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 5;
        // to know the number is even or odd.
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        System.out.println("=======================================");

        // ternaries....
        String result = (n % 2 == 0) ? "even" : "odd";
        System.out.println(result);

        System.out.println("=======================================");

        int age = 17;
        if (age >= 19) {
            System.out.println("eligible");
        } else {
            System.out.println(" not eligible");
        }

        System.out.println("=======================================");

        String result1 = (age >= 19) ? "eligible" : "not eligible";
        // you can also use print statement like this  system.out.println((age >= 19) ? "eligible" : "not eligible")
        // for reusable date we can assign as variable.  ===  result.
        System.out.println(result1);


        System.out.println("=======================================");

        int number = 100;//positive or negative or zore ?
/*
        if (number>0){
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

 */
        String result3 = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println(result3);
    }
}
