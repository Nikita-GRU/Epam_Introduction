package epam.introduction.module4.task2_3;
//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private double square;
    private int population;
    private List<Area> areas;

    public Region(List<Area> areas) {
        double square = 0;
        int population = 0;
        for (Area area : areas
        ) {
            square += area.getSquare();
            population += area.getPopulation();
            if (area.getCity().isRegionalCentre())
                this.name = new String(area.getCity().getName() + "-Region");
        }
        this.square = square;
        this.population = population;
        this.areas = areas;
    }

    public Region(Area area) {
        this.name = new String(area.getCity().getName() + "-Region");
        this.square = area.getSquare();
        this.population = getPopulation();
        List<Area> areas = new ArrayList<>();
        areas.add(area);
        this.areas = areas;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
}
