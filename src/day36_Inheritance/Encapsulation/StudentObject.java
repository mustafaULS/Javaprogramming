package day36_Inheritance.Encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("mustafa",32,'M','A',"cydeo");
        System.out.println(student1);

        student1.setName("mokoko");
        student1.setAge(18);
        System.out.println(student1);




    }
}
