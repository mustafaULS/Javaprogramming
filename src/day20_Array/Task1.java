package day20_Array;

public class Task1 {

    public static void main(String[] args) {


        String[] name = {"mustafa ulusoy", "sadam idris", "sude koksal", "ersat artus", "ali bogra",};


        for (int i = 0; i < name.length; i++) { // i is index number .
            String initail =name[i].charAt(0)+" . "+name[i].charAt(name[i].indexOf(" ")+1);
            System.out.println(initail);



        }





    }

}
