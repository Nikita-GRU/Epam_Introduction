package epam.introduction.module4.task1_10;

import epam.introduction.module4.task1_6.MyTime;

import java.util.Arrays;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//       Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//       Найти и вывести:
//       a) список рейсов для заданного пункта назначения;
//       b) список рейсов для заданного дня недели;
//       c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class AirlineMain {
    public static void main(String[] args) {
        AirlineView airlineView = new AirlineView();
        AirlineDBLogic airlineDBLogic = new AirlineDBLogic();
        AirlineDB airlineDB = new AirlineDB(Arrays.asList(
                new Airline("Minsk", Airline.PlaneType.HEAVY_JET, new MyTime("00:31:46"),
                        new Airline.DaysOfFlight[]{Airline.DaysOfFlight.THURSDAY, Airline.DaysOfFlight.WEDNESDAY}),
                new Airline("Madrid", Airline.PlaneType.LIGHT_JET, new MyTime("12:30:45"),
                        new Airline.DaysOfFlight[]{Airline.DaysOfFlight.TUESDAY}),
                new Airline("Madrid", Airline.PlaneType.MID_SIZE_JET, new MyTime("15:00:45"),
                        new Airline.DaysOfFlight[]{Airline.DaysOfFlight.FRIDAY, Airline.DaysOfFlight.SATURDAY}),
                new Airline("Munich", Airline.PlaneType.LIGHT_JET, new MyTime("13:20:00"),
                        new Airline.DaysOfFlight[]{Airline.DaysOfFlight.TUESDAY, Airline.DaysOfFlight.SATURDAY}),
                new Airline("Moscow", Airline.PlaneType.MID_SIZE_JET, new MyTime("22:55:55"),
                        new Airline.DaysOfFlight[]{Airline.DaysOfFlight.MONDAY, Airline.DaysOfFlight.TUESDAY,
                                Airline.DaysOfFlight.FRIDAY, Airline.DaysOfFlight.SATURDAY})
        ));
        airlineView.printAirlinesByDestination(airlineDB, "Madrid");
        System.out.println("");
        airlineView.printAirlinesByDay(airlineDB, Airline.DaysOfFlight.THURSDAY);
        System.out.println("");
        airlineView.printAirlinesByDayAndTime(airlineDB, Airline.DaysOfFlight.FRIDAY, new MyTime("12:30:45"));

    }
}
