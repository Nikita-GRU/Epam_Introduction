package epam.introduction.module4.task1_7;

//Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления
//площади, периметра и точки пересечения медиан.
public class Triangle {
    private double xA;
    private double xB;
    private double xC;
    private double yA;
    private double yB;
    private double yC;
    private double lengthAB;
    private double lengthAC;
    private double lengthBC;

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
        this.yA = yA;
        this.yB = yB;
        this.yC = yC;

        this.lengthAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
        this.lengthAC = Math.sqrt(Math.pow((xC - xA), 2) + Math.pow((yC - yA), 2));
        this.lengthBC = Math.sqrt(Math.pow((xC - xB), 2) + Math.pow((yC - yB), 2));

    }

    public double getLengthAB() {
        return lengthAB;
    }

    public double getLengthAC() {
        return lengthAC;
    }

    public double getLengthBC() {
        return lengthBC;
    }

    public double getxA() {
        return xA;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public double getxC() {
        return xC;
    }

    public void setxC(double xC) {
        this.xC = xC;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }

    public double getyC() {
        return yC;
    }

    public void setyC(double yC) {
        this.yC = yC;
    }


}


