package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 14","6.7 inches",1100,"black");

        Samsung samsung= new Samsung("galaxy s12","6 inches",988,"white");

        Nokia nokia = new Nokia("brick","4 inches",150,"gray");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



        System.out.println("-------------------------------------");


        iphone.call(911);
        iphone.text(4321);
        iphone.faceTime(123123);
        iphone.faceTime("123@gmail.com");

        System.out.println("-------------------------------------");

        samsung.call(123123);
        samsung.text(123123);
        samsung.freezing();

        System.out.println("-------------------------------------");

        nokia.selfDefense();




    }

}
