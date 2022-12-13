package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("mustafa",'M',32,150000);

        System.out.println(employee1);

        employee1.setAge(34);
        System.out.println(employee1);

        employee1.setSalary(employee1.getSalary()+10000);
        System.out.println(employee1);



    }
}
