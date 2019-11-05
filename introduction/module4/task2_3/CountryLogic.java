package epam.introduction.module4.task2_3;
//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;
import java.util.List;

public class CountryLogic {
    public CountryLogic() {
    }

    public City getCapital(Country country) {
        City city = new City("", 0, 0);
        for (Region region : country.getRegions()
        ) {
            for (Area area : region.getAreas()
            ) {
                if (area.getCity().isCapital())
                    city = area.getCity();

            }
        }
        return city;
    }

    public int getNumberOfRegions(Country country) {
        return country.getRegions().size();
    }

    public double getSquare(Country country) {
        double square = 0;
        for (Region region :
                country.getRegions()) {
            square += region.getSquare();

        }
        return square;
    }

    public List<City> getRegionalCentres(Country country) {
        List<City> cities = new ArrayList<>();
        for (Region region : country.getRegions()
        ) {
            for (Area area : region.getAreas()
            ) {
                if (area.getCity().isRegionalCentre())
                    cities.add(area.getCity());
            }
        }
        return cities;
    }
}
