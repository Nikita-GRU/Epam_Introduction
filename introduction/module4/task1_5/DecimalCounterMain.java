package epam.introduction.module4.task1_5;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounterMain {
    public static void main(String[] args) {
        DecimalCounterView decimalCounterView = new DecimalCounterView();
        DecimalCounter decimalCounter = new DecimalCounter(8, 0, 10);
        DecimalCounterOperator decimalCounterOperator = new DecimalCounterOperator();
        decimalCounterOperator.increment(decimalCounter);
        decimalCounterOperator.increment(decimalCounter);
        decimalCounterOperator.increment(decimalCounter);
        decimalCounterOperator.decrement(decimalCounter);
        decimalCounterOperator.decrement(decimalCounter);
        decimalCounterView.printValue(decimalCounter);

    }
}
