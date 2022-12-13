package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;
       String days= (number==1)?"monday":(number==2)?"tuesday":(number==3)?"wensday":(number==4)?"thursday"
               : (number==5)?"friday":(number==6)?"saturday":"sudnay";

        System.out.println(days);


    }
}
