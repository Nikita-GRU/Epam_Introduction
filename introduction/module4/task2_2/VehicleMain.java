package epam.introduction.module4.task2_2;

import java.util.Arrays;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class VehicleMain {
    public static void main(String[] args) {
        VehicleLogic vehicleLogic = new VehicleLogic();
        Driver driver = new Driver();
        //creating a vehicle,
        Vehicle vehicle = new Vehicle(Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel()),
                new Engine("Ford", Engine.EngineType.DIESEL));

        vehicleLogic.refuel(vehicle);

        driver.letsDrive(vehicleLogic, vehicle);
        driver.letsDrive(vehicleLogic, vehicle);
        driver.letsDrive(vehicleLogic, vehicle);
        driver.letsDrive(vehicleLogic, vehicle);
        vehicleLogic.changeWheel(vehicle);
        driver.letsDrive(vehicleLogic, vehicle);
        driver.letsDrive(vehicleLogic, vehicle);
        driver.printVehicleParams(vehicle);
    }
}
