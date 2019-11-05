package epam.introduction.module4.task1_7;

//Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления
//площади, периметра и точки пересечения медиан.
public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(0,0,5,0,5,4);
        TriangleView triangleView = new TriangleView();

        triangleView.printSquare(triangle);
        triangleView.printPerimeter(triangle);
        triangleView.printMedianCoordinates(triangle);
    }
}
