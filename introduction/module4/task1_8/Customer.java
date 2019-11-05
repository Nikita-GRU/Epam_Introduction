package epam.introduction.module4.task1_8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//       Найти и вывести:
//       a) список покупателей в алфавитном порядке;
//       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Customer {
    private static int customerCounter = 1;
    private int id;
    private String surname;
    private String name;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    public Customer() {
        this.id = customerCounter;
        this.surname = "";
        this.name = "";
        this.address = "";
        this.creditCardNumber = "";
        this.bankAccountNumber = "";
        customerCounter++;
    }

    public Customer(String surname, String name, String address, String creditCardNumber, String bankAccountNumber) {
        this.id = customerCounter;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
        customerCounter++;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
