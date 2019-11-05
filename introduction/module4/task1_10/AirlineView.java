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

import epam.introduction.module4.task1_6.MyTime;
import epam.introduction.module4.task1_6.MyTimeView;

import java.util.Arrays;

public class AirlineView {
    public AirlineView() {
    }

    public void printAirline(Airline airline) {
        MyTimeView myTimeView = new MyTimeView();

        System.out.print("Airline #" + airline.getFlightId() + ": destination =" + airline.getDestination()
                + ", plane type=" + airline.getPlaneType() + ", time=");
        myTimeView.printMyTime(airline.getTimeOfDeparture());
        System.out.println("days of the week=" + Arrays.toString(airline.getDaysOfFlights()));
    }

    public void printAirlineDB(AirlineDB airlineDB) {
        for (Airline airline : airlineDB.getAirlines()
        ) {
            printAirline(airline);
        }
    }

    public void printAirlinesByDestination(AirlineDB airlineDB, String destination) {
        printAirlineDB(new AirlineDBLogic().getAirlinesByDestination(airlineDB, destination));
    }

    public void printAirlinesByDay(AirlineDB airlineDB, Airline.DaysOfFlight dayOfFlight) {
        printAirlineDB(new AirlineDBLogic().getAirlinesByDay(airlineDB, dayOfFlight));
    }

    public void printAirlinesByDayAndTime(AirlineDB airlineDB, Airline.DaysOfFlight dayOfFlight, MyTime time) {
        printAirlineDB(new AirlineDBLogic().getAirlinesByDayAfterTime(airlineDB, dayOfFlight, time));
    }

}
