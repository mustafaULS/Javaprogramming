package day11_Switch_Scanner;

public class CappuccinoMix {
    public static void main(String[] args) {

        String size = "tall";
        String result = "";
        boolean valid = size == "tall" || size == "grande" || size == "venti";
        if (valid) {
            switch (size) {
                case "tall":
                    result="price is $3.69\n" +
                            "90 calories";
                    break;
                case "grande":
                    result="price is $3.99;\n" +
                            "120 calories";
                    break;
                default:
                    result="price is $4.29\n" +
                            "150 calories\n";
            }
        } else {
            result="Invalid size";
        }
        System.out.println(result);

    }
}
