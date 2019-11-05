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

public class Airline {
    private static int flightCounter = 1;
    private int flightId;
    private String destination;
    private PlaneType planeType;
    private MyTime timeOfDeparture;
    private DaysOfFlight[] daysOfFlights;

    public Airline() {
        this.flightId = flightCounter;
        this.destination = "";
        this.planeType = PlaneType.HEAVY_JET;
        this.timeOfDeparture = new MyTime();
        this.daysOfFlights = DaysOfFlight.values();
        flightCounter++;
    }

    public Airline(String destination, PlaneType planeType, MyTime timeOfDeparture, Airline.DaysOfFlight[] daysOfFlights) {
        this.flightId = flightCounter;
        this.destination = destination;
        this.planeType = planeType;
        this.timeOfDeparture = timeOfDeparture;
        this.daysOfFlights = daysOfFlights;
        flightCounter++;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public MyTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(MyTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public DaysOfFlight[] getDaysOfFlights() {
        return daysOfFlights;
    }

    public void setDaysOfFlights(DaysOfFlight[] daysOfFlights) {
        this.daysOfFlights = daysOfFlights;
    }

    public enum PlaneType {LIGHT_JET, MID_SIZE_JET, HEAVY_JET}

    public enum DaysOfFlight {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

}
