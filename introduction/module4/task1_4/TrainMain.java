package epam.introduction.module4.task1_4;

import java.util.Scanner;

//4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем.
//Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//назначения должны быть упорядочены по времени отправления.
public class TrainMain {
    public static void main(String[] args) {
        TerminalView terminalView = new TerminalView();
        RailwayStation railwayStation = new RailwayStation(new Train[]{
                new Train("Minsk", 2, "22:00"),
                new Train("Kiev", 1, "21:17"),
                new Train("Minsk", 23, "20:23"),
                new Train("Vologda", 41, "05:45"),
                new Train("Novosibirsk", 22, "11:11")});

        terminalView.printTrainsByDestinationAndTime(railwayStation);

        //console user interface (printing Train info by number)
        int number = -1;
        while (number != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type a 2-digit number of train to see info, type 0 to exit ");
            String str = scanner.next();
            if (str.matches(new String("^[0-9]|[0-9][0-9]$"))) {
                number = Integer.parseInt(str);
                terminalView.printTrainByNumber(number, railwayStation);
            } else
                System.out.println("Wrong number format");

        }
    }
}
