package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {


        Developer developer1 = new Developer("sdue",22,'F',123123,"software developer",150000);

        Tester tester1 = new Tester("mustafa",32,'M',123321,"SDET",150000);

        Teacher teacher1 = new Teacher("ali",38,'M',32123,"math teacher",140000);

        Student student1 = new Student("ahmet",29,'M',33212,"SDET");


        System.out.println(developer1);
        System.out.println(teacher1);
        System.out.println(teacher1);
        System.out.println(student1);


        System.out.println("------------------------------------------------");



        developer1.setAge(21);
        developer1.setSalary(200000);
        System.out.println(developer1.getName());
        System.out.println(developer1);
        System.out.println("------------------------------------------------");

        developer1.fixingBug();
        developer1.work();
        tester1.work();
        teacher1.work();
        System.out.println("------------------------------------------------");

        developer1.eat();
        tester1.drink();
        teacher1.sleep();







    }


}
