package epam.introduction.module4.task2_2;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehicleLogic {
    private static final int FUEL_PER_DRIVE = 25;
    private static final int REFUEL_COUNT = 100;

    public VehicleLogic() {
    }

    // checking for the Vehicle properties, if they are OK , then decreasing fuel and one from the wheel's counter
    //if the wheel's counter =0 - we remove it from wheels list
    public int testDrive(Vehicle vehicle) {
        if (vehicle.wheels.size() >= 4 && (vehicle.fuel >= FUEL_PER_DRIVE)) {
            int fuel = vehicle.fuel;
            vehicle.setFuel(fuel - FUEL_PER_DRIVE);
            int wheelStatus = vehicle.getWheels().get(0).getDrivesCanRunCount();
            vehicle.getWheels().get(0).setDrivesCanRunCount(--wheelStatus);
            if (wheelStatus < 1) {
                List<Wheel> wheels = new ArrayList<>();
                Iterator<Wheel> iterator = vehicle.getWheels().iterator();
                iterator.next();
                while (iterator.hasNext())
                    wheels.add(iterator.next());
                vehicle.setWheels(wheels);
            }
            return 1;
        } else {
            if (vehicle.wheels.size() < 4 && vehicle.fuel < FUEL_PER_DRIVE)
                return 2;
            else {
                if (vehicle.wheels.size() < 4)
                    return 3;
                else return 4;
            }
        }
    }
//adding new wheel
    public void changeWheel(Vehicle vehicle) {
        vehicle.getWheels().add(new Wheel());

    }
//adding a constant fuel value
    public void refuel(Vehicle vehicle) {
        int currentFuel = vehicle.fuel;
        vehicle.setFuel(currentFuel + REFUEL_COUNT);

    }


}
