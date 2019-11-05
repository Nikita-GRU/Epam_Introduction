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

import java.util.ArrayList;
import java.util.List;

//       a) список книг заданного автора;
//       b) список книг, выпущенных заданным издательством;
//       c) список книг, выпущенных после заданного года.
public class BookPackLogic {
    public BookPackLogic() {
    }

    public BookPack getBooksByAuthor(BookPack bookPack, String author) {
        List<Book> filteredByAuthor = new ArrayList<>();
        for (Book book : bookPack.getBookPack()) {
            for (String auth : book.getAuthors()
            ) {
                if (auth.matches(author))
                    filteredByAuthor.add(book);

            }

        }
        return new BookPack(filteredByAuthor);
    }

    public BookPack getBooksByPublisher(BookPack bookPack, String publisher) {
        List<Book> filteredByPublisher = new ArrayList<>();
        for (Book book : bookPack.getBookPack()) {
            if (book.getPublisher().matches(publisher))
                filteredByPublisher.add(book);
        }
        return new BookPack(filteredByPublisher);
    }

    public BookPack getBooksAfterYear(BookPack bookPack, int year) {
        List<Book> filteredAfterYear = new ArrayList<>();
        for (Book book : bookPack.getBookPack()) {
            if (book.getYear() >= year)
                filteredAfterYear.add(book);
        }
        return new BookPack(filteredAfterYear);

    }
}
