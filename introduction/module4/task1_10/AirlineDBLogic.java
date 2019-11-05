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

import java.util.ArrayList;
import java.util.List;

public class AirlineDBLogic {
    public AirlineDBLogic() {
    }

    public AirlineDB getAirlinesByDestination(AirlineDB airlineDB, String destination) {
        List<Airline> filteredByDestination = new ArrayList<>();
        for (Airline airline : airlineDB.getAirlines()
        ) {
            if (airline.getDestination().matches(destination))
                filteredByDestination.add(airline);
        }

        return new AirlineDB(filteredByDestination);
    }

    public AirlineDB getAirlinesByDay(AirlineDB airlineDB, Airline.DaysOfFlight day) {
        List<Airline> filteredByDay = new ArrayList<>();
        for (Airline airline : airlineDB.getAirlines()) {
            for (Airline.DaysOfFlight days : airline.getDaysOfFlights()
            ) {
                if (days == day)
                    filteredByDay.add(airline);
            }
        }
        return new AirlineDB(filteredByDay);
    }

    public AirlineDB getAirlinesByDayAfterTime(AirlineDB airlineDB, Airline.DaysOfFlight day, MyTime time) {
        List<Airline> airlinesByDayAfterTime = new ArrayList<>();
        AirlineDB airlinesByDay = getAirlinesByDay(airlineDB, day);
        for (Airline airline : airlinesByDay.getAirlines()
        ) {
            if (airline.getTimeOfDeparture().getHours() > time.getHours()) {
                airlinesByDayAfterTime.add(airline);
            } else {
                if (airline.getTimeOfDeparture().getHours() == time.getHours()) {
                    if (airline.getTimeOfDeparture().getMinutes() > time.getMinutes()) {
                        airlinesByDayAfterTime.add(airline);
                    }
                } else {
                    if (airline.getTimeOfDeparture().getMinutes() == time.getMinutes()) {
                        if (airline.getTimeOfDeparture().getSeconds() >= time.getSeconds())
                            airlinesByDayAfterTime.add(airline);
                    }
                }
            }
        }


        return new AirlineDB(airlinesByDayAfterTime);
    }
}
