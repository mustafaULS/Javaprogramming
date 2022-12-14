package day39_Recap.cydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBug(){
        System.out.println(getName()+" "+getJobTitle()+" is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getName()+ getJobTitle()+" is developing");
    }





}
