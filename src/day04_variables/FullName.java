package day04_variables;

public class FullName {
    public static void main(String[] args) {
        String FristName = "mustafa";
        String LastName = "ulusoy";
        String FullName = FristName + " " + LastName;
        int age = 33;
        String JobTitle = "SDET";
        String CompanyName = "Apple Inc";
        double salary = 98988.5;
        System.out.println("Full Name Of This Person Is " + FristName + " " + LastName);
        System.out.println("Full Name Of This Person Is " + FullName);
        System.out.println(FullName + " is " + age + " years old .");
        System.out.println(FullName+ "" + " is "+ JobTitle+ " and working at "+CompanyName+"."
        + FullName + " Has $"+ salary+" yearly income.");



    }
}
