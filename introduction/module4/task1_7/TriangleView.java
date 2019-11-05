package epam.introduction.module4.task1_7;
//Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления
//площади, периметра и точки пересечения медиан.

import java.util.Arrays;

public class TriangleView {
    private TriangleLogic triangleLogic = new TriangleLogic();

    public TriangleView() {
    }

    public void printSquare(Triangle triangle) {
        System.out.println("Square=" + triangleLogic.getSquare(triangle));
    }

    public void printPerimeter(Triangle triangle) {
        System.out.println("Perimeter=" + triangleLogic.getPerimeter(triangle));
    }

    public void printMedianCoordinates(Triangle triangle) {
        System.out.println("Mediane coordinates:" + Arrays.toString(triangleLogic.getMedianCoordinates(triangle)));
    }

}

