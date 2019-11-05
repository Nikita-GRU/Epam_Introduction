package epam.introduction.module4.task2_3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class CountryView {

    public CountryView() {
    }

    public void printCountry(Country country) {
        System.out.println("Country:" + country.getName() + ", Capital="
                + new CountryLogic().getCapital(country).getName());
        for (Region region : country.getRegions()
        ) {
            printRegion(region);
        }
    }

    public void printRegion(Region region) {
        System.out.println("Region:" + region.getName() + " square=" + region.getSquare() + ", Areas:");
        for (Area area : region.getAreas()
        ) {
            printArea(area);
        }

    }

    public void printArea(Area area) {
        System.out.print("Area:" + area.getName() + ", population="
                + area.getPopulation() + ", square=" + area.getSquare() + " - ");
        printCity(area.getCity());
    }

    public void printCity(City city) {
        System.out.println("City:" + city.getName() + ", population="
                + city.getPopulation() + ", square=" + city.getSquare());
    }

    public void printCapital(Country country) {
        printCity(new CountryLogic().getCapital(country));
    }

    public void printNumberOfRegions(Country country) {
        System.out.println("Number of regions:" + new CountryLogic().getNumberOfRegions(country));
    }

    public void printSquare(Country country) {
        System.out.println("Square=" + new CountryLogic().getSquare(country));
    }

    public void printRegions(Country country) {
        for (Region region : country.getRegions()
        ) {
            printRegion(region);
        }

    }
}


