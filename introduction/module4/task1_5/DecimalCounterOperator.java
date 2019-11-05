package epam.introduction.module4.task1_5;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounterOperator {
    public DecimalCounterOperator() {
    }

    //Counter can have an only allowed value, if it more or less than limit, every "outofbounds" operation will do nothing
    public DecimalCounter increment(DecimalCounter decimalCounter) {
        int temp = decimalCounter.getValue();
        if ((temp + 1) > decimalCounter.getEndOfRange()) {
        } else
            decimalCounter.setValue(++temp);
        return decimalCounter;
    }

    public DecimalCounter decrement(DecimalCounter decimalCounter) {
        int temp = decimalCounter.getValue();
        if ((temp - 1) < decimalCounter.getStartOfRange()) {
        } else
            decimalCounter.setValue(--temp);
        return decimalCounter;
    }

}
