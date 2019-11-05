package epam.introduction.module4.task1_9;

import java.util.Arrays;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//       Найти и вывести:
//       a) список книг заданного автора;
//       b) список книг, выпущенных заданным издательством;
//       c) список книг, выпущенных после заданного года.
public class BookMain {
    public static void main(String[] args) {
        BookView bookView = new BookView();
        BookPackLogic bookPackLogic = new BookPackLogic();
        BookPack bookPack = new BookPack(Arrays.asList(
                new Book("Football", new String[]{"HEMINGWAY"}, 1890,
                        "Wilco", 200, 100, Book.BindingType.HARD),
                new Book("Soccer", new String[]{"DIDION"}, 2009,
                        "ESMA", 41, 144, Book.BindingType.SOFT),
                new Book("Voleyball", new String[]{"HEMINGWAY", "FLYNN"}, 1944,
                        "GIGN", 55, 511, Book.BindingType.SOFT),
                new Book("Basketball", new String[]{"BRADBURY"}, 1900,
                        "ESMA", 143, 664, Book.BindingType.SOFT),
                new Book("Tennis", new String[]{"RAND", "HEMINGWAY"}, 2008,
                        "GIGN", 186, 1145, Book.BindingType.HARD),
                new Book("Hockey", new String[]{"MARTIN", "DIDION"}, 2001,
                        "Wilco", 499, 200, Book.BindingType.HARD))
        );

        bookView.printBookPack(bookPack);
        System.out.println("");
        bookView.printBooksAfterYear(bookPack,2000);
        System.out.println("");
        bookView.printBooksByAuthor(bookPack,"HEMINGWAY");
        System.out.println("");
        bookView.printBooksByPublisher(bookPack,"GIGN");
    }
}
