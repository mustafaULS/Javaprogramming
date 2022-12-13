package day36_Inheritance.bookTask;

public class AudioBook extends Book{


    public double length;
    public String narrator;

    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }


    public void listen(){

    }





}
