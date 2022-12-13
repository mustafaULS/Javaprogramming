package day14_String2;

import java.util.Scanner;

public class EmailDomainWithScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your Email");//  mustafa@gmail.com
//                                                 12345678901234567
        String userEmail = scan.next();

        userEmail =userEmail.substring(userEmail.indexOf("@")+1,userEmail.lastIndexOf("."));
                                        // int  +1
        System.out.println("userEmail = " + userEmail);


    }


}
