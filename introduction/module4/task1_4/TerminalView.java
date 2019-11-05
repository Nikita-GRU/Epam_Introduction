package epam.introduction.module4.task1_4;

//4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем.
//Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//назначения должны быть упорядочены по времени отправления.
public class TerminalView {
    public TerminalView() {
    }

    public void printTrains(RailwayStation railwayStation) {
        System.out.println("Trains:");
        for (Train train : railwayStation.getTrains()
        ) {
            printTrain(train);
        }
    }

    public void printTrainsByDestinationAndTime(RailwayStation railwayStation) {
        printTrains(new Terminal().sortByDestinationAndTime(railwayStation));
    }

    public void printTrainByNumber(int number, RailwayStation railwayStation) {
        Terminal terminal = new Terminal();
        Train train = terminal.getTrainNumber(number, railwayStation);
        if (train != null)
            printTrain(train);
        else if (number == 0) {
            System.out.println("Bye-Bye");
        } else
            System.out.println("Train #" + number + " is not exist");
    }

    public void printTrain(Train train) {
        System.out.println("#" + train.getTrainNumber()
                + " Departure:" + train.getDateOfDeparture()
                + " Destination:" + train.getDestination());
    }

}
