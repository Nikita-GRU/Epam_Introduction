package epam.introduction.module4.task1_8;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//       Найти и вывести:
//       a) список покупателей в алфавитном порядке;
//       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerDBLogic {
    public CustomerDBLogic() {
    }

    public void addCustomer(CustomerDB customerDB, Customer customer) {
        List<Customer> temp = new ArrayList<>();
        for (Customer c : customerDB.getCustomers()
        ) {
            temp.add(c);
        }
        temp.add(customer);
        customerDB.setCustomers(temp);

    }

    public void removeCustomer(CustomerDB customerDB, int id) {
        List<Customer> temp = new ArrayList<>();
        for (Customer c : customerDB.getCustomers()
        ) {
            temp.add(c);
        }
        temp.remove(id - 1);
        customerDB.setCustomers(temp);
    }
//sorting by name and surname
    public CustomerDB sortAlphabetically(CustomerDB customerDB) {
        List<Customer> temp = customerDB.getCustomers();
        temp.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                int surnameCompare = o1.getSurname().compareTo(o2.getSurname());
                int firstNameCompare = o1.getName().compareTo(o2.getName());

                if (surnameCompare != 0)
                    return surnameCompare;
                else
                    return firstNameCompare;
            }
        });
        return new CustomerDB(temp);
    }
//needs optimization(maybe)
    public CustomerDB filterByCCNumberRange(CustomerDB customerDB, String startOfRange, String endOfRange) {
        long start = Long.parseLong(startOfRange);
        long end = Long.parseLong(endOfRange);
        List<Customer> filteredCustomerDB = new ArrayList<>();
        for (Customer customer : customerDB.getCustomers()
        ) {
            for (long i = start; i <= end; i++) {
                if (Long.parseLong(customer.getCreditCardNumber()) == i)
                    filteredCustomerDB.add(customer);
            }
        }
        return new CustomerDB(filteredCustomerDB);
    }
}
