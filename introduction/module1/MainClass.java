package epamTraining.BasicsOfSoftwareDevelopment_1;

import java.math.BigInteger;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

    }

    //1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void taskOne(double a, double b, double c) {
        System.out.println(((a - 3) * b / 2) + c);
    }

    //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void taskTwo(double a, double b, double c) {
        System.out.println(((b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - a * a * a * c + Math.pow(b, -2)));
    }

    //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void taskThree(double x, double y) {
        System.out.println(((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y)));
    }

    //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.
    public static void taskFour(Double r) {
        String stringValue = r.toString();
        int dot = stringValue.indexOf('.');
        String answer = "";
        for (int i = dot + 1; i < stringValue.length(); i++) {
            answer += stringValue.charAt(i);
        }
        answer += '.';
        for (int i = 0; i < dot; i++) {
            answer += stringValue.charAt(i);
        }
        System.out.println(Double.parseDouble(answer));

    }

    //5.  Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void taskFive(int initSeconds) {
        int hours = (int) Math.floor(initSeconds / 3600);
        int minutes = (int) Math.floor(initSeconds - 3600 * hours) / 60;
        int seconds = initSeconds - 3600 * hours - 60 * minutes;
        System.out.println(hours + "ч" + minutes + "мин" + seconds + "с");
    }

    //6. Для данной области составить линейную программу, которая печатает  true, если точка с координатами (х, у)
    //принадлежит закрашенной области, и false — в противном случае:
    public static void taskSix(int x, int y) {
        if (y == -1 && x == 0) {
            System.out.println("false");
        }

        if (y > 0) {
            if (y <= 4 && x >= -2 && x <= 2) {
                System.out.println("true");
            }
        }
        if (y <= 0) {
            if (y >= -3 && x >= -4 && x <= 4) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }

    //7. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public static void taskSeven(int angle1, int angle2) {
        int angle3 = 180 - angle1 - angle2;
        String answer = "";
        if (angle3 <= 0)
            answer += "Triangle doesn't exist";
        if (angle3 > 0) {
            answer += "Triangle exist";
            if (angle1 == 90 || angle2 == 90 || angle3 == 90)
                answer += " and right";
        }
        System.out.println(answer);

    }

    //8. Найти max{min(a, b), min(c, d)}.
    public static void taskEight(int a, int b, int c, int d) {
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }

    //9. Даны три точки А(х1,у1), В(х2,у2)  и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void taskNine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (((x2 - x1) / (x3 - x2)) == ((y2 - y1) / (y3 - y2)))
            System.out.println("true");
        else System.out.println("false");

    }

    //10. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void taskTen(int holeWidth, int holeLength, int brickWidth, int brickLength, int brickHeight) {
        if (holeLength * holeWidth > brickWidth * brickLength || holeLength * holeWidth > brickWidth * brickHeight ||
                holeLength * holeWidth > brickWidth * brickLength)
            System.out.println("true");
        else System.out.println("false");
    }

    // 11. Вычислить значение функции:
    public static void taskEleven(int x) {
        if (x > 3)
            System.out.println(1 / (x * x * x + 6));
        else System.out.println(x * x - 3 * x + 9);
    }

    //12. Напишите программу, где пользователь вводит любое  целое  положительное  число. А программа суммирует
    //все числа от 1 до введенного пользователем числа.
    public static void taskTwelve() {
        int number = -1;
        while (number != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type an positive integer to get a sum from 1 to itself, type 0 to exit ");
            String str = scanner.next();
            if (Integer.parseInt(str) > 0) {
                number = Integer.parseInt(str);
                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println(sum);
            } else
                number = Integer.parseInt(str);
            System.out.println("Wrong number format");

        }
    }

    //13. Вычислить значения функции на отрезке [а,b] c шагом h:
    public static void taskThirteen(double a, double b, double h) {
        for (double i = a; i <= b; i += h) {
            if (i > 2)
                System.out.println("y = " + i);
            if (i <= 2)
                System.out.println("y = " + (-i));
        }
    }

    //14. Найти сумму квадратов первых ста чисел.
    public static void taskFourteen() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);

    }

    //15. Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void taskFifteen() {
        BigInteger product = BigInteger.valueOf(1);
        for (int i = 1; i < 200; i++) {
            product = product.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(product);
    }

    //16.  Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен
    //заданному е.
    public static void taskSixteen(double e, int nMin, int nMax) {
        double sum = 0;
        for (int n = nMin; n < nMax; n++) {
            double aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(aN) >= e)
                sum += aN;
        }
        System.out.println(sum);

    }

    //17. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void taskSeventeen(int countOfChars) {
        if (countOfChars <= Character.MAX_CODE_POINT) {
            for (int i = 0; i < countOfChars; i++) {
                System.out.println((char) i + " - " + i);

            }
        } else
            System.out.println("wrong countOfChars");
    }

    //18.Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
    public static void taskEighteen(int m, int n) {

        for (int i = m; i <= n; i++) {
            boolean isSimple = true;
            System.out.print("the % of " + i + " are - ");
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    System.out.print(k + "  ");
                    isSimple = false;
                }
            }
            if (isSimple)
                System.out.print("it's simple!");
            System.out.println("");
        }
    }

    //19. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void taskNineteen(int number1, int number2) {

        int temp1, temp2;
        System.out.print("Matching numbers are:");
        while (number1 > 0) {
            temp2 = number1 % 10;
            number1 = number1 / 10;
            temp1 = number2;
            while (temp1 > 0) {
                if (temp1 % 10 == temp2) {
                    System.out.print(temp2 + " ");
                    break;
                }
                temp1 = temp1 / 10;
            }

        }
    }
}


