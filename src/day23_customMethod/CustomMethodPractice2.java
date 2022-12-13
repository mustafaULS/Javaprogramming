package day23_customMethod;

public class CustomMethodPractice2 {

    public static void main(String[] args) {


        helloWorld5Times();
        System.out.println("-----------");
        helloCydeo5Times();
        System.out.println("-----------");
        evenNumbers();

    }


    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("hello cydeo.");
        }
    }

    public static void evenNumbers(){

        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }

    }

}


