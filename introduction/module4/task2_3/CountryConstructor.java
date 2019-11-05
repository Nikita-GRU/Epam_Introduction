package epam.introduction.module4.task2_3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class CountryConstructor {
    public CountryConstructor() {
    }

    public Country createNewCountryWithCity(String name, City capital) {
        Country country = new Country();
        capital.setCapital(true);
        capital.setRegionalCentre(true);
        country.setName(name);
        country.getRegions().add(new Region(new Area(capital)));
        return country;
    }

    public void addNewRegionalCentre(City city, Country country) {

        city.setRegionalCentre(true);
        country.getRegions().add(new Region(new Area(city)));

    }

    public void addCityToRegion(City city, Region region) {

        region.getAreas().add(new Area(city));
        region.setSquare(region.getSquare() + city.getSquare());


    }

    public void addRegion(City city, Country country) {
        country.getRegions().add(new Region(new Area(city)));

    }

    public void addRegion(Region region, Country country) {
        country.getRegions().add(region);

    }

    public void setCityArea(int population, double square, Area area) {
        area.setSquare(area.getCity().getSquare() + square);
        area.setPopulation(area.getCity().getPopulation() + population);
    }


}
