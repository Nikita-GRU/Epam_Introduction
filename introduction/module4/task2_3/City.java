package epam.introduction.module4.task2_3;

public class City {
    private String name;
    private int population;
    private boolean isRegionalCentre;
    private boolean isCapital;
    private double square;

    public City(String name, int population, double square) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.isCapital = false;
        this.isRegionalCentre = false;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isRegionalCentre() {
        return isRegionalCentre;
    }

    public void setRegionalCentre(boolean regionalCentre) {
        isRegionalCentre = regionalCentre;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }
}
