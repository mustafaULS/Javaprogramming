package day20_Array;

public class Task3 {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods",
                "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0,
                439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349,
                12350};

        int glovesNumber = 0;
        boolean hasIpad = false;
        String itemNames = "";
        double itemPrice = 0;
        int Id = 0;
        String report = "";
        for (int i = 0; i < items.length; i++) { // i just a number .
            if (items[i].equals("Gloves")) {
                glovesNumber = i;
            }
            if (items[i].equals("iPad")) {
                hasIpad = true;
            }
            itemNames = items[i];
            itemPrice = prices[i];
            Id = itemIDs[i];
            report = itemNames + " " + itemPrice + " " + Id;
            System.out.println(report);


        }
        System.out.println(glovesNumber);
        System.out.println(hasIpad);


    }
}
