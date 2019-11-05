package epam.introduction.module4.task1_9;
//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//       Найти и вывести:
//       a) список книг заданного автора;
//       b) список книг, выпущенных заданным издательством;
//       c) список книг, выпущенных после заданного года.

public class Book {
    private static int bookCounter = 1;
    private int id;
    private String title;
    private String[] authors;
    private int year;
    private String publisher;
    private int numOfPages;
    private int price;
    private BindingType bindingType;

    public Book() {
        this.id = bookCounter;
        this.title = "";
        this.authors = new String[]{""};
        this.year = 0;
        this.publisher = "";
        this.numOfPages = 0;
        this.price = 0;
        this.bindingType = BindingType.HARD;
    }

    public Book(String title, String[] authors, int year, String publisher, int numOfPages, int price, BindingType bindingType) {
        this.id = bookCounter;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.publisher = publisher;
        this.numOfPages = numOfPages;
        this.price = price;
        this.bindingType = bindingType;
        bookCounter++;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    public static void setBookCounter(int bookCounter) {
        Book.bookCounter = bookCounter;
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

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }

    public enum BindingType {HARD, SOFT}
}
