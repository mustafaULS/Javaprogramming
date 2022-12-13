package day24_CustomMethod_Return;

public class BreakfastTask {

    public static void main(String[] args) {

        initial("mustafa", "ulusoy");
        System.out.println("---------------");

        domain("mtf.m114@gmail.com");
        System.out.println("---------------");

        String[] emails = {"mustafa.m@gmail;.com", "sude.koksal@yahoo.com", "sadam@wtf.com", "irfan@hotmail.com"};
        // get every domain of this array
        for (String eachEmail : emails) {
            domain(eachEmail);
        }
        System.out.println("---------------");

        nameOfMonth(12);
        System.out.println("---------------");




    }

    //1.initail of the person
    public static void initial(String firstName, String lastName) {

        String initial = firstName.charAt(0) + " . " + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);

    }

    //2.domain of emails
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //3.name of the month
    public static void nameOfMonth(int number) {

        String nameOfMonth = "";

        if (number >= 1 && number <= 12) {
            nameOfMonth = (number == 1) ? "jan" : (number == 2) ? "feb" : (number == 3) ? "mar" : (number == 4) ? "ape" : (number == 5) ? "marc" :
                    (number == 6) ? "jun" : (number == 7) ? "jul" : (number == 8) ? "agu" : (number == 9) ? "sep" : (number == 10) ? "oct" : (number == 11) ? "nov" :
                            "dec";
        } else {
            nameOfMonth = "Invalid Number";
        }

        System.out.println(nameOfMonth);
    }

    //4.name of the day.
    public static void nameOfDay(int number){
        String nameOfDay ="";


    }

}
