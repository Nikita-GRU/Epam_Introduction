package epam.introduction.module4.task1_10;
//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//       Найти и вывести:
//       a) список рейсов для заданного пункта назначения;
//       b) список рейсов для заданного дня недели;
//       c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.util.List;

public class AirlineDB {
    List<Airline> airlines;

    public AirlineDB(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }
}
