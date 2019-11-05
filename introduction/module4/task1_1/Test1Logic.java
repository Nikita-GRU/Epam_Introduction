package epam.introduction.module4.task1_1;

//1.  Создайте  класс  Test 1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих
//переменных.  Добавьте  метод,  который  находит  сумму  значений  этих  переменных,  и  метод,  который  находит
//наибольшее значение из этих двух переменных.
public class Test1Logic {
    public Test1Logic() {
    }

    public int getVarSum(Test1 test1) {
        return test1.getVar1() + test1.getVar2();
    }

    public int getVarMax(Test1 test1) {
        return Math.max(test1.getVar1(), test1.getVar2());
    }
}
