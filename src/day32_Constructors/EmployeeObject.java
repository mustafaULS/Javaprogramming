package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("ali");
        System.out.println(employee1);


        Employee employee2= new Employee("asya",'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("ahmet",'M',"QA");
        System.out.println(employee3);

    }
}
