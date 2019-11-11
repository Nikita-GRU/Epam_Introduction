package epam.introduction.module2.multidimensional_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

// Задачи. Массивы массивов
public class Main {

    public static void main(String[] args) {
        task15();
    }

    public static double[][] initRandomMatrix(int rows, int columns) {
        double[][] matrix = new double[rows][columns];
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("A matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.round(Math.random() * 200) - 100; //elements from -100 to 100
                System.out.print(decimalFormat.format(matrix[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        for (double[] columns : matrix
        ) {
            for (double value : columns
            ) {
                System.out.print(decimalFormat.format(value) + " ");
            }
            System.out.println("");
        }

    }

    //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    public static void task1() {
        int rows = 4;
        int columns = 4;
        double[][] matrix = initRandomMatrix(rows, columns);
        System.out.println("Resulting matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 1; j += 2) {
                if (matrix[0][j] > matrix[rows - 1][j])
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    public static void task2() {
        int rows = 4;
        int columns = rows;
        double[][] matrix = initRandomMatrix(rows, columns);
        System.out.println("Diagonal elements:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
            System.out.println("");
        }

    }

    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void task3() {
        int rows = 5;
        int columns = 8;
        int k = 3;
        int p = 5;
        double[][] matrix = initRandomMatrix(rows, columns);
        System.out.print(" k=" + k + " " + "row-> ");
        for (int i = 0; i < columns; i++) {
            System.out.print(matrix[k][i] + " ");
        }
        System.out.println(" ");
        System.out.print(" p=" + p + " " + "column-> ");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][p] + " ");
        }
    }

    //4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void task4() {
        int n = 14;
        int rows = n;
        int columns = n;
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i += 2) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = j + 1;
            }
        }
        for (int i = 1; i < rows; i += 2) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = n - j;
            }
        }
        printMatrix(matrix);
    }

    //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void task5() {
        int n = 14;
        int rows = n;
        int columns = n;
        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
        printMatrix(matrix);
    }

    //6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void task6() {
        int n = 10;
        int rows = n;
        int columns = n;
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i < n / 2) {
                    if (j >= i && j < n - i)
                        matrix[i][j] = 1;
                } else if (j <= i && j > n - i - 2)
                    matrix[i][j] = 1;

            }
        }
        printMatrix(matrix);
    }

    public static void task7() {
        int n = 3;
        int rows = n;
        int columns = n;
        double iDouble;
        double jDouble;
        double nDouble = n;
        int positivesCounter = 0;
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            iDouble = i;
            for (int j = 0; j < columns; j++) {
                jDouble = j;
                matrix[i][j] = Math.sin(((iDouble * iDouble) - (jDouble * jDouble)) / nDouble / nDouble);
                if (matrix[i][j] > 0)
                    positivesCounter++;
            }
        }
        printMatrix(matrix);
        System.out.println("positivesCounter = " + positivesCounter);
    }

    //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    //пользователь с клавиатуры.
    public static void task8() {
        int rows = 4;
        int columns = 6;
        int switchColumn1;
        int switchColumn2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers of columns to switch ");
        switchColumn1 = scanner.nextInt();
        switchColumn2 = scanner.nextInt();
        double[][] matrix = initRandomMatrix(rows, columns);
        double[] temp = new double[columns];
        for (int i = 0; i < rows; i++) {
            temp[i] = matrix[i][switchColumn1];
            matrix[i][switchColumn1] = matrix[i][switchColumn2];
            matrix[i][switchColumn2] = temp[i];
        }
        System.out.println("switchColumn1 = " + switchColumn1);
        System.out.println("switchColumn2 = " + switchColumn2);
        printMatrix(matrix);
    }

    //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    //столбец содержит максимальную сумму.
    public static void task9() {
        int rows = 5;
        int columns = 4;
        double[][] matrix = initRandomMatrix(rows, columns);
        int maxSumColumn = 0;
        double maxSum = 0;

        for (int i = 0; i < columns; i++) {
            double sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += matrix[j][i];
                if (sum > maxSum) {
                    maxSumColumn = i;
                    maxSum = sum;
                }
            }
        }
        System.out.println("maxSum = " + maxSum);
        System.out.println("maxSumColumn = " + maxSumColumn);


    }

    //10. Найти положительные элементы главной диагонали квадратной матрицы.
    public static void task10() {
        int rows = 5;
        int columns = rows;
        double[][] matrix = initRandomMatrix(rows, columns);
        System.out.println("Positive diag elements are: ");
        for (int i = 0; i < rows; i++) {
            if (matrix[i][i] > 0)
                System.out.print(matrix[i][i] + " ");
        }

    }

    //11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    //которых число 5 встречается три и более раз.
    public static void task11() {
        int rows = 10;
        int columns = 20;
        double[][] matrix = new double[rows][columns];
        int[] fiveRows = new int[rows + 1]; // +1 stands for comfortable output (to avoid skipping "0" row)
        int fiveRow = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("A matrix:");
        for (int i = 0; i < rows; i++) {
            int fiveCounter = 0;
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.round(Math.random() * 15);
                System.out.print(decimalFormat.format(matrix[i][j]) + " ");
                if (matrix[i][j] == 5)
                    fiveCounter++;
            }
            if (fiveCounter >= 3) {
                fiveRows[fiveRow] = i + 1; // +1 stands for comfortable output (to avoid skipping "0" row)
                fiveRow++;
            }
            System.out.println("");
        }
        System.out.print("Rows with 3 or more '5' are: ");
        for (int row : fiveRows
        ) {
            if (row > 0) //THERE IT IS, WHERE "0" row is skipped!! =)
                System.out.print(row + " ");
        }
        System.out.println("");
    }

    //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    public static void task12() {
        int rows = 10;
        int columns = 20;
        double[][] matrix = initRandomMatrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 1; k < columns - j; k++) {
                    if (matrix[i][k - 1] < matrix[i][k]) {  //descending 'if', ascending 'if' -  (matrix[i][k - 1] > matrix[i][k])
                        double temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k - 1];
                        matrix[i][k - 1] = temp;
                    }
                }

            }
        }
        printMatrix(matrix);
    }

    //13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    public static void task13() {
        int rows = 5;
        int columns = 6;
        double[][] matrix = initRandomMatrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 1; k < rows - i; k++) {
                    if (matrix[k - 1][j] < matrix[k][j]) {  //descending 'if', ascending 'if' -  (matrix[i][k - 1] > matrix[i][k])
                        double temp = matrix[k][j];
                        matrix[k][j] = matrix[k - 1][j];
                        matrix[k - 1][j] = temp;
                    }
                }
            }
        }
        printMatrix(matrix);
    }

    //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    //единиц равно номеру столбца.

    public static void task14() {
        int rows = 10;
        int columns = 17;
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < i && k < rows; k++) {
                int randomRow = (int) Math.round(Math.random() * (rows - 1));
                while (matrix[randomRow][i] == 1) {
                    randomRow = (int) Math.round(Math.random() * (rows - 1));
                }
                matrix[randomRow][i] = 1;
            }
        }
        printMatrix(matrix);
    }

    //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static void task15() {
        int rows = 5;
        int columns = 6;
        double[][] matrix = initRandomMatrix(rows, columns);
        double maxElement = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement)
                    maxElement = matrix[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 2 != 0)
                    matrix[i][j] = maxElement;
            }
        }
        printMatrix(matrix);
        System.out.println("maxElement = " + maxElement);
    }

    //16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
    //..., n2  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    //
    //собой. Построить такой квадрат.
    public static void task16() {
        int rows = 5;
        int columns = 6;
    }
}

