package day08_IfStatment;

public class SalaryCalculator {
    public static void main(String[] args) {


        int hourlyRate = 50,
                weeklyHours = 45;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;// one week salary * 52
        System.out.println("Gross pay is " + salaryBeforeTax);

        double stateRate = 6.5,
                federalRate = 26.2;
        double stateTax = stateRate * salaryBeforeTax / 100;
        double federalTax = federalRate * salaryBeforeTax / 100;
        System.out.println("State tax is: " + stateTax);
        System.out.println("Federal tax is: " + federalTax);
        double totalTax = federalTax + stateTax;
        System.out.println("Total tax is:" + totalTax);
        double netIncome = salaryBeforeTax - totalTax;
        System.out.println("netIncome = " + netIncome);


    }

}
/*
3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */
