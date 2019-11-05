package epam.introduction.module4.task2_2;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Engine {
    private String engineModel;
    private EngineType engineType;
    public Engine(String engineModel, EngineType engineType) {
        this.engineModel = engineModel;
        this.engineType = engineType;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public enum EngineType {GASOLINE, DIESEL, GAS}
}
