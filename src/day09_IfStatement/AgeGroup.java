package day09_IfStatement;

public class AgeGroup {

    public static void main(String[] args) {

        int age = 50;
        String hayat ;


        if (age >= 1 && age <= 2) {
            hayat = "infant";
        } else if (age >= 3 && age <= 5) {
            hayat = "toddler";
        } else if (age >= 6 && age <= 9) {
            hayat = "kid";
        } else if (age >= 10 && age <= 12) {
            hayat = "pre teen";
        } else if (age >= 13 && age <= 17) {
            hayat = " teenager";
        } else if (age >= 18 && age <= 20) {
            hayat = " young adult";
        } else if (age >= 21 && age <= 39) {
            hayat = " adult";
        } else if (age >= 40 && age <= 49) {
            hayat = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            hayat = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            hayat = "Very Young Senior Citizen";
        } else {hayat = "Young Senior Citizen";}

        System.out.println(hayat);
    }
}
/*
5. Create a class called AgeGroups, and write a program that can define
the age groups of a person
             age groups are:
                    infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult
(40 - 49),
                    Middle-Aged Adult (50 -
54),
                    Very Young Senior Citizen
(55 - 64),
                    Young Senior Citizen (65
- 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */