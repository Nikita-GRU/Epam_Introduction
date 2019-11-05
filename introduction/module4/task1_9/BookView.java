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

import java.util.Arrays;

public class BookView {
    public BookView() {
    }

    public void printBookPack(BookPack bookPack) {
        for (Book book : bookPack.getBookPack()
        ) {
            printBook(book);
        }
    }

    public void printBooksByAuthor(BookPack bookPack, String author) {
        printBookPack(new BookPackLogic().getBooksByAuthor(bookPack, author));
    }

    public void printBooksByPublisher(BookPack bookPack, String publisher) {
        printBookPack(new BookPackLogic().getBooksByPublisher(bookPack, publisher));
    }

    public void printBooksAfterYear(BookPack bookPack, int year) {
        printBookPack(new BookPackLogic().getBooksAfterYear(bookPack, year));
    }

    public void printBook(Book book) {
        System.out.println("Book #" + book.getId() + ": title=" + book.getTitle()
                + ", authors=" + Arrays.toString(book.getAuthors()) + ", publisher=" + book.getPublisher()
                + ", year=" + book.getYear() + ", pages=" + book.getNumOfPages() + ", price=" + book.getPrice()
                + ", bindType=" + book.getBindingType());
    }
}
