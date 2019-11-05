package epam.introduction.module4.task1_7;

//Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления
//площади, периметра и точки пересечения медиан.
public class TriangleLogic {
    public TriangleLogic() {
    }

    public boolean isExist(Triangle triangle) {

        if (triangle.getLengthAB() != 0 && triangle.getLengthAC() != 0 && triangle.getLengthBC() != 0)
            return true;
        else
            return false;
    }

    public double getPerimeter(Triangle triangle) {
        if (isExist(triangle))
            return triangle.getLengthAB() + triangle.getLengthAC() + triangle.getLengthBC();
        else {
            return 0.0;
        }
    }

    public double getSquare(Triangle triangle) {
        if (isExist(triangle))
            return Math.sqrt(getPerimeter(triangle) / 2
                    * (getPerimeter(triangle) / 2 - triangle.getLengthAB())
                    * (getPerimeter(triangle) / 2 - triangle.getLengthAC())
                    * (getPerimeter(triangle) / 2 - triangle.getLengthBC()));
        else {
            return 0.0;
        }
    }

    public double[] getMedianCoordinates(Triangle triangle) {
        if (isExist(triangle))
            return new double[]{(triangle.getxA() + triangle.getxB() + triangle.getxC()) / 3,
                    triangle.getyA() + triangle.getyB() + triangle.getyC() / 3};
        else {
            return new double[]{0.0, 0.0};
        }
    }
}
