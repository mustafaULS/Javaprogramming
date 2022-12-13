package day30_CustomClasses;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {


        Student student1= new Student();
        student1.setInfo("mustafa",'M',32,1234,'A');

        System.out.println(student1);

        Student student2= new Student();
        student2.setInfo("sude",'F',21,4563,'A');
        Student student3= new Student();
        student3.setInfo("ahmet",'M',38,6788,'B');
        Student student4= new Student();
        student4.setInfo("bilal",'M',32,8907,'C');
        Student student5= new Student();
        student5.setInfo("hayat",'F',25,2341,'D');

        Student [] students={student1,student2,student3,student4,student5};

        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }

        System.out.println("----------------------------------------------------");

        ArrayList<Student> earlyBirds= new ArrayList<>();// grade A;
        ArrayList<Student> angryBirds= new ArrayList<>();

        for (Student each : students) {
            if (each.grade=='A'){
                earlyBirds.add(each);
            }else {
                angryBirds.add(each);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }
}
