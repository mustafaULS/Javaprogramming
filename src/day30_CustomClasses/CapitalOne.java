package day30_CustomClasses;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("mustafa", 123321, 'M', 32, "manager", 150000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("sude", 234123, 'F', 21, "QA", 100000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("ali", 345432, 'M', 38, "QA", 70000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("bilal", 345567, 'M', 32, "SM", 120000, true);

        Employee employee5 = new Employee();
        employee5.setInfo("hanna", 768543, 'F', 26, "QA", 60000, false);


        Employee [] employees={employee1,employee2,employee3,employee4,employee5};

        //find full time

        int countFullTime=0;
        int countPartTime=0;
        //max and min salary :
        double max = employees[0].salary; // set one for the max, then re assign .
        double min = employees[0].salary;



        for (Employee each : employees) {
            if (each.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
            if (each.salary>max){
                max=each.salary;
            }

            if (each.salary<min){
                min=each.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);






    }
}
