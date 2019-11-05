package epam.introduction.module4.task2_3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class CountryMain {
    public static void main(String[] args) {
        CountryView countryView = new CountryView();
        CountryConstructor countryConstructor = new CountryConstructor();
        City minsk = new City("Minsk", 100000000, 1000);
        Country belarus = countryConstructor.createNewCountryWithCity("Belarus", minsk);
        City brest = new City("Brest", 5000000, 500);
        City homel = new City("Homel", 300000, 300);
        City smolevici = new City("Smolevici", 10000, 20);
        Area brestArea = new Area(brest);
        Region brestRegion = new Region(brestArea);
        countryConstructor.addCityToRegion(smolevici, brestRegion);
        countryConstructor.addRegion(brestRegion, belarus);

        countryView.printNumberOfRegions(belarus);
        System.out.println("");
        countryView.printCapital(belarus);
        System.out.println("");
        countryView.printSquare(belarus);
    }
}
