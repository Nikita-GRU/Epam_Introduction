package epam.introduction.module4.task1_4;
//4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем.
//Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//назначения должны быть упорядочены по времени отправления.

public class Train {

    private String destination;
    private int trainNumber;
    private String dateOfDeparture;

    public Train(String destination, int trainNumber, String timeOfDeparture) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.dateOfDeparture = timeOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }


}

