package epam.introduction.module4.task1_5;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounter {
    private int value;
    private int startOfRange;
    private int endOfRange;

    public DecimalCounter() {
        this.value = 0;
        this.startOfRange = 0;
        this.endOfRange = 10;
    }

    public DecimalCounter(int value, int startOfRange, int endOfRange) {
        this.startOfRange = startOfRange;
        this.endOfRange = endOfRange;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStartOfRange() {
        return startOfRange;
    }

    public void setStartOfRange(int startOfRange) {
        this.startOfRange = startOfRange;
    }

    public int getEndOfRange() {
        return endOfRange;
    }

    public void setEndOfRange(int endOfRange) {
        this.endOfRange = endOfRange;
    }
}
