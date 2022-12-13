package day04_variables;

public class SalaryCulculator {
    public static void main(String[] args) {


        //hourly weekly salary calculation
        int hourlyRate = 50;
        int weeklyHours = 40;
        int salary = hourlyRate * weeklyHours * 52;

        System.out.println(salary);
        System.out.println(weeklyHours);
        System.out.println(hourlyRate);
        // ==========================================
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("salary = $" + salary);

    }
}