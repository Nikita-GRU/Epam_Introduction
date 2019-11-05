package epam.introduction.module2.onedimensional_arrays;
//this import is only to  print results comfortably =)
import java.util.Arrays;

// ОДНОМЕРНЫЕ МАССИВЫ
public class Main {
    public static void main(String[] args) {
        //task1(2);
        //task2(20);
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
    }

//1. В массив A  [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

    public static void task1(int k) {
        int[] array = {1, 3, 4, 5, 6, 8, 36, 6, 4, 3, 2, 3, 4, 546, 64, 646, 22, 2};
        int sum = 0;
        for (int value : array
        ) {
            if (value % k == 0)
                sum += value;
        }
        System.out.println(sum);
    }

    //2. Дана последовательность действительных чисел . Заменить все ее члены, большие данного Z, этим
    //числом. Подсчитать количество замен.
    public static void task2(double z) {
        double[] array = {1.2, 22, 445.6, 11.188, 19, 63.3, 789};
        int replaceCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                replaceCounter++;
            }
        }
        System.out.println("ReplaceCounter =" + replaceCounter);
        System.out.println(Arrays.toString(array));
    }

    //3.  Дан  массив  действительных  чисел,  размерность  которого  N .  Подсчитать,  сколько  в  нем  отрицательных,
    //положительных и нулевых элементов.
    public static void task3() {
        double[] array = {-1.2, 22, 445.6, 0, -19, 63.3, 789, 0, -10, -100};
        int nullCounter = 0;
        int posCounter = 0;
        int negCounter = 0;
        for (double value : array
        ) {
            if (value < 0)
                negCounter++;
            else if (value == 0)
                nullCounter++;
            else
                posCounter++;
        }
        System.out.println("negCounter = " + negCounter);
        System.out.println("posCounter = " + posCounter);
        System.out.println("nullCounter = " + nullCounter);
    }

    //4. Даны действительные числа . Поменять местами наибольший и наименьший элементы.
    public static void task4() {
        double[] array = {-1.2, 22, 445.6, 0, -19, 63.3, 789, 0, -10, -100};
        double minValue = array[0];
        int minId = 0;
        double maxValue = array[0];
        int maxId = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minId = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxId = i;
            }
        }
        array[maxId] = minValue;
        array[minId] = maxValue;
        System.out.println("maxId = " + maxId);
        System.out.println("minId = " + minId);
        System.out.println("maxValue = " + maxValue);
        System.out.println("minValue = " + minValue);
        System.out.println("array = " + Arrays.toString(array));

    }

    //5.Даны целые числа. Вывести на печать только те числа, для которых а  > i.
    //                                                                                                                i
    public static void task5() {
        int[] array = {1, 3, -4, 5, 0, 8, -36, -6, 4, 3, 2, -3, 4, 0, 64, 646, 22, 2};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i)
                System.out.println("value = " + array[i]);
        }
    }

    //6.  Задана  последовательность  N  вещественных  чисел.  Вычислить  сумму  чисел,  порядковые  номера  которых
    //являются простыми числами.
    public static void task6() {
        double[] array = {-1.2, 221, 1, 1, -19, 1, 789, 1, -10, -100, 353, 1};
        double sum = 0;
        boolean isSimple;
        for (int i = 2; i < array.length; i++) {
            isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                sum += array[i];
        }
        System.out.println("sum = " + sum);
    }

    //7. Даны действительные числа.  Найти max(a n + a n+1)
    public static void task7() {
        double[] array = {-1.2, 221, 1, 1, -19, 1, 100, 1, -10, -100, 353, 1};
        double sum = 0;
        double max = array[0] + array[1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + array[i + 1] > max)
                max = array[i] + array[i + 1];

        }
        System.out.println("max = " + max);
    }

    //8.  Дана  последовательность  целых  чисел .  Образовать  новую  последовательность,  выбросив  из
    //исходной те члены, которые равны  min(a(n))
    public static void task8() {
        int[] array = {10, 5, 3, 1, 3, 7, 17, 1, 1, 1, 1, 1, 1, 1};
        //step1 find min
        int min = array[0];

        for (int i : array
        ) {
            if (i < min)
                min = i;
        }
        //step2 find number of mins to create array without it
        int minCounter = 0;
        for (int i : array
        ) {
            if (i == min)
                minCounter++;
        }
        //step3 creating new array, k is for matching indexes
        int[] array2 = new int[array.length - minCounter];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min)
                array2[i - k] = array[i];
            else {
                k++;

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

    //9. В массиве целых чисел с количеством элементов n  найти наиболее часто встречающееся число. Если таких
    //чисел несколько, то определить наименьшее из них.
    public static void task9() {
        int[] array = {12, 12, 4, 5, 6, 3, 4, 6, 4, 3, 12, 3, 4, 4, 4, 12, 12, 2};
        int maxCount = 0;
        int numberCounter = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            numberCounter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    numberCounter++;
            }
            if (numberCounter > maxCount) {
                maxCount = numberCounter;
                number = array[i];
            } else {
                number = (numberCounter == maxCount) ? (number > array[i]) ? array[i] : number : number;

            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("number = " + number);
    }

    //10.  Дан  целочисленный  массив  с  количеством  элементов  п.  Сжать  массив,  выбросив  из  него  каждый  второй
    //элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    public static void task10() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println("every second element to null:" + Arrays.toString(array));
        int q = 2;
        for (int k = 0; k < array.length; k++) {
            for (int i = q; i < array.length; i += 2) {
                array[i - 1] = array[i];
                array[i] = 0;
            }
            q++;
        }
        System.out.println("answer:" + Arrays.toString(array));
    }
}



