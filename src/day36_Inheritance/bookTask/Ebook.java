package day36_Inheritance.bookTask;

public class Ebook extends Book{

    public String size;
    public int page;

    public Ebook(String title, String type, String author, double price, String size, int page) {
        super(title, type, author, price);
        this.size = size;
        this.page = page;
    }

    public void readBook(){
        System.out.println();
    }


}
