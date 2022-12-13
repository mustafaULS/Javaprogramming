package day23_customMethod;

public class Task4 {

    public static void main(String[] args) {
        vote(20,"USA");

    }

    public static void vote(int age,String citizen){
        if (age>=18 && citizen.equals("USA")){
            System.out.println(" you can vote");
        }else {
            System.out.println(" sorry you can NOT vote");
        }


    }

}
