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

import java.util.List;

public class BookPack {
    private List<Book> bookPack;

    public BookPack(List<Book> bookPack) {
        this.bookPack = bookPack;
    }

    public List<Book> getBookPack() {
        return bookPack;
    }

    public void setBookPack(List<Book> bookPack) {
        this.bookPack = bookPack;
    }
}
