package epam.introduction.module4.task2_2;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Wheel {
    private static final int WHEEL_COUNTER = 3;
    private int drivesCanRunCount;

    public Wheel() {
        this.drivesCanRunCount = WHEEL_COUNTER;
    }

    public int getDrivesCanRunCount() {
        return drivesCanRunCount;
    }

    public void setDrivesCanRunCount(int drivesCanRunCount) {
        this.drivesCanRunCount = drivesCanRunCount;
    }


}
