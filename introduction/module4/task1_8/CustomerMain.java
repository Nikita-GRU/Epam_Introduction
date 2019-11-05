package epam.introduction.module4.task1_8;

import java.util.Arrays;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//       Найти и вывести:
//       a) список покупателей в алфавитном порядке;
//       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class CustomerMain {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        CustomerDB customerDB = new CustomerDB(Arrays.asList(
                new Customer("Josep", "Guardiola"
                        , "Barcelona", "0000000000004999", "3332"),
                new Customer("Jurgen", "Klopp"
                        , "Liverpool", "0000000050000000", "2245"),
                new Customer("Carlo", "Ancelotti"
                        , "Napoli", "0000000000005009", "3378"),
                new Customer("Mauriciu", "Sarri"
                        , "Torino", "1000606005000001", "1146"),
                new Customer("Jose", "Mourinho"
                        , "Lissabon", "0000000000000800", "4256")));


        customerView.printCustomersAlphabetically(customerDB);
        customerView.printCustomersByCCRange(customerDB,"0000000000001000","0000000000101111");

    }
}
