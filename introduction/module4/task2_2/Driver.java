package epam.introduction.module4.task2_2;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Driver {
    public Driver() {
    }

    public void letsDrive(VehicleLogic vehicleLogic, Vehicle vehicle) {
        switch (vehicleLogic.testDrive(vehicle)) {
            case 1:
                System.out.println("On the way=)");
                break;
            case 2:
                System.out.println("Change wheels and refuel!");
                break;
            case 3:
                System.out.println("Change wheels!");
                break;
            case 4:
                System.out.println("Refuel!");
                break;
        }
    }

    public void printVehicleParams(Vehicle vehicle) {
        System.out.println("Vehicle: engine=" + vehicle.getEngine().getEngineModel()
                + "/" + vehicle.getEngine().getEngineType() + ", fuel=" + vehicle.getFuel()
                + " wheels:");
        int wheelCount = 1;
        for (Wheel wheel : vehicle.getWheels()
        ) {
            System.out.println("Wheel#" + wheelCount + ". DrivingsRemaining=" + wheel.getDrivesCanRunCount() + "");
            wheelCount++;
        }

    }

}
