package ua.intita.qa;

public class Book {
    int id;
    String title;
    String author;
    String publishHouse;
    int year;
    int pages;
    double price;
    String binding;

    Book (int id, String title, String author, String publishHouse, int year, int pages, double price, String binding){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishHouse = publishHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }
    public static void choiceAuthor(Book book, String auth) {
        if (book.author.equals(auth)) {
            System.out.println(book.getTitle()+" "+book.getAuthor());
        }
    }

    public static void choicePublishHouse(Book book, String publHouse) {
        if (book.publishHouse.equals(publHouse)) {
            System.out.println(book.getTitle()+" "+book.getAuthor()+ " "+book.getPublishHouse());
        }
    }

    public static void publishAfter(Book book, int year){
        if(book.year >= year){
            System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getYear());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }
}