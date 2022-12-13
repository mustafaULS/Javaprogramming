package day33_Statics;

import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("ali");

        Student student2 = new Student("ahmet", 'M');

        Student student3 = new Student("sude", 123321);

        Student student4 = new Student("james", 12346, 'A');

        Student student5 = new Student("kobe", 'M', 40);

        Student student6 = new Student("jordan", 'M', 55, 321321);

        Student student7 = new Student("mustafa", 'M', 32, 2345, 'A');


        // this array can only store student object.
        Student [] students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));


    }


}
