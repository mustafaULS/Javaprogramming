package day15_ForLoop;

public class Task7 {
    public static void main(String[] args) {


        String str = "java",
                //    0123
                result = "";

        for (int i = str.length()-1; i>=0 ; i--) {
            // length -1 equals to index number .
            // start from 3 ,  3 is greater than 0 ,look for the statement,
            // statement  str.charAt(3) == a ,  old result == space, so space add a equals to a,
            // then i--, become 2 , 2 is greater than 0 look at the statement
            //str.charAt(2) == v
            //result was a, now add v become av
            // then 1 then 0 . like this go forward

            result +=str.charAt(i);

        }
        System.out.println(result);




    }
}
