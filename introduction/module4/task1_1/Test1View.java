package epam.introduction.module4.task1_1;

//1.  Создайте  класс  Test 1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих
//переменных.  Добавьте  метод,  который  находит  сумму  значений  этих  переменных,  и  метод,  который  находит
//наибольшее значение из этих двух переменных.
public class Test1View {
    public Test1View() {
    }

    public void printVar1(Test1 test1) {
        System.out.println(test1.getVar1());
    }

    public void printVar2(Test1 test1) {
        System.out.println(test1.getVar2());
    }

    public void printVarSum(Test1 test1) {
        System.out.println(new Test1Logic().getVarSum(test1));
    }

    public void printVarMax(Test1 test1) {
        System.out.println(new Test1Logic().getVarMax(test1));
    }
}
