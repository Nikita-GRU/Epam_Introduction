package epam.introduction.module4.task1_1;

//1.  Создайте  класс  Test 1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих
//переменных.  Добавьте  метод,  который  находит  сумму  значений  этих  переменных,  и  метод,  который  находит
//наибольшее значение из этих двух переменных.
public class Test1Main {
    public static void main(String[] args) {
        Test1Logic test1Logic = new Test1Logic();
        Test1View test1View = new Test1View();
        Test1 test1 = new Test1(5, 6);
        test1View.printVarSum(test1);
        test1View.printVarMax(test1);
    }
}
