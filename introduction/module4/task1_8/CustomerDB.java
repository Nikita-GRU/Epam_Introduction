package epam.introduction.module4.task1_8;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//       Найти и вывести:
//       a) список покупателей в алфавитном порядке;
//       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.List;

public class CustomerDB {

    private List<Customer> customers;

    public CustomerDB(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


}
