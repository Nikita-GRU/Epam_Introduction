package epam.introduction.module4.task2_2;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

import java.util.List;

public class Vehicle {

    List<Wheel> wheels;
    Engine engine;
    int fuel;

    public Vehicle(List<Wheel> wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = 0;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
