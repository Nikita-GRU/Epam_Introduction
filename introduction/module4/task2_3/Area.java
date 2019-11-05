package epam.introduction.module4.task2_3;

public class Area {
    private String name;
    private City city;
    private double square;
    private int population;

    public Area(City city, double square, int population) {
        this.name = new String(city.getName() + "-Area");
        this.city = city;
        this.square = square;
        this.population = population;
    }

    public Area(City city) {
        this.name = new String(city.getName() + "-Area");
        this.city = city;
        this.square = city.getSquare();
        this.population = city.getPopulation();
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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
}
