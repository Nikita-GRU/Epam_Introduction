package epam.introduction.module4.task1_8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//       Найти и вывести:
//       a) список покупателей в алфавитном порядке;
//       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class CustomerView {
    public CustomerView() {
    }

    public void printCustomerDB(CustomerDB customerDB) {
        for (Customer customer : customerDB.getCustomers()
        ) {
            printCustomer(customer);
        }
        System.out.println("");

    }
    public void printCustomersAlphabetically(CustomerDB customerDB) {
        printCustomerDB(new CustomerDBLogic().sortAlphabetically(customerDB));
        System.out.println("");
    }

    public void printCustomersByCCRange(CustomerDB customerDB, String startOfRange, String endOfRange) {
        printCustomerDB(new CustomerDBLogic().filterByCCNumberRange(customerDB, startOfRange, endOfRange));
        System.out.println("");
    }

    public void printCustomer(Customer customer) {
        System.out.println("Customer id#" + customer.getId()
                + ": name=" + customer.getSurname() + " " + customer.getName()
                + ", address=" + customer.getAddress() + ", ccNumber="
                + customer.getCreditCardNumber() + ", bank account=" + customer.getBankAccountNumber());
    }

}
