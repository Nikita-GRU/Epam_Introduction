package epam.introduction.module4.task1_4;
//4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем.
//Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//назначения должны быть упорядочены по времени отправления.

import java.util.Arrays;
import java.util.Comparator;

public class Terminal {
    public Terminal() {
    }

    public RailwayStation sortByDestinationAndTime(RailwayStation railwayStation) {
        Arrays.sort(railwayStation.getTrains(), new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                int comp = o1.getDestination().compareTo(o2.getDestination());
                if (comp != 0)
                    return o1.getDestination().compareTo(o2.getDestination());
                else
                    return o1.getDateOfDeparture().compareTo(o2.getDateOfDeparture());
            }
        });
        return railwayStation;
    }

    public RailwayStation sortByNumber(RailwayStation railwayStation) {
        Train[] sortedTrains = railwayStation.getTrains();
        for (int i = 0; i < railwayStation.getTrains().length - 1; i++) {
            Train temp;
            if (sortedTrains[i].getTrainNumber() > sortedTrains[i + 1].getTrainNumber() && i + 1 <= sortedTrains.length - 1) {
                temp = sortedTrains[i];
                sortedTrains[i] = sortedTrains[i + 1];
                sortedTrains[i + 1] = temp;
            }
        }
        return new RailwayStation(sortedTrains);
    }

    public Train getTrainNumber(int number, RailwayStation railwayStation) {
        Train trainByNumber = null;
        for (Train train : railwayStation.getTrains()
        ) {
            if (train.getTrainNumber() == number)
                trainByNumber = train;
        }
        return trainByNumber;
    }
}
