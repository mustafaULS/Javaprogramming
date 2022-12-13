package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 100, b = 500, c = 300;

        boolean aIsMinNumber = (a > b && a < c) || (a > c && a < b);// || need one of the statement has to be true.
        boolean bIsMinNumber = (b > a && b < c) || (b > c && b < a);
        //boolean cIsMinNumber = (c>a && c <b)|| (c>b && c<a);
        boolean cIsMinNumber = !aIsMinNumber && !bIsMinNumber;
        // none of the a or b is median number ,so c is median number .
        if (aIsMinNumber) {
            System.out.println(a +" is median number ");
        }
        if (bIsMinNumber){
            System.out.println(b + " is median number");
        }
        if (cIsMinNumber){
            System.out.println(c + " is median number ");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */