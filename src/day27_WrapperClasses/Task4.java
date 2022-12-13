package day27_WrapperClasses;

public class Task4 {
    public static void main(String[] args) {
        String str = "JAVA java";

        int isUpperCase = 0;
        int isLowerCase = 0;

        for (int i = 0; i < str.toCharArray().length; i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                isUpperCase++;
            }
            if (Character.isLowerCase(each)){
                isLowerCase++;
            }
        }
        boolean result = isLowerCase==isUpperCase;
        System.out.println(result);


    }
}

