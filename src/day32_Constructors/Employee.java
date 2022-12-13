package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name) {
        this.name = name;
    }

        // constructor overloading:
    public Employee(String name, char gender) {
         this(name);             // calling constructor inside another constructor.
        //this.name = name;       re-use this function. don't duplicate.
        this.gender = gender;

    }

    public Employee(String name,char gender,String jobTitle){
        this(name,gender);

        this.jobTitle=jobTitle;

    }

    public Employee(String name,char gender,String jobTitle,double salary){

        this(name, gender, jobTitle);
        this.salary=salary;

    }





    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
