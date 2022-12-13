package day11_Switch_Scanner;

public class CappuccinoSwitch {
    public static void main(String[] args) {// switch class.

        String size = "grande";

        switch (size) {
            case "tall":
                System.out.println("price is $3.69\n" +
                        "90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99;\n" +
                        "120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29\n" +
                        "150 calories");
                break;
            default:
                System.out.println("Invalid size");
        }

    }
}
