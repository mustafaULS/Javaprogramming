package day24_CustomMethod_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

        nameOfMonth(34);

    }

    public static void nameOfMonth(int number) {

        if (number<1 || number>12){
            System.out.println("Invalid number");
            return;// exit the method .  don't check rest of the codes.
        }

           String name = (number == 1) ? "jan" : (number == 2) ? "feb" : (number == 3) ? "mar"
                    : (number == 4) ? "ape" : (number == 5) ? "marc" : (number == 6) ? "jun" :
                    (number == 7) ? "jul" : (number == 8) ? "agu" : (number == 9) ? "sep" :
                            (number == 10) ? "oct" : (number == 11) ? "nov" : "dec";

        System.out.println("name = " + name);
        }






    }

