package epam.introduction.module4.task1_6;

//6.  Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
//заданное количество часов, минут и секунд.
public class MyTimeLogic {
    public MyTimeLogic() {
    }

    //the logic of adding hours is like if sum is > 24, then we start again with 00h
    public void addHours(int hours, MyTime myTime) {
        int totalHours = hours + myTime.getHours();
        if (totalHours >= 24)
            myTime.setHours(totalHours % 24);
        else
            myTime.setHours(totalHours);
    }

    //the logic of adding minutes is like if sum is > 60, then we adding an hour
    public void addMinutes(int minutes, MyTime myTime) {
        int totalMinutes = minutes + myTime.getMinutes();
        if (totalMinutes >= 60) {
            addHours((totalMinutes - totalMinutes % 60) / 60, myTime);
            myTime.setMinutes(totalMinutes % 60);
        } else
            myTime.setMinutes(totalMinutes);

    }

    //the logic of adding seconds is like if sum is > 60, then we adding an minute
    public void addSeconds(int seconds, MyTime myTime) {
        int totalSeconds = seconds + myTime.getSeconds();
        if (totalSeconds >= 60) {
            addMinutes((totalSeconds - totalSeconds % 60) / 60, myTime);
            myTime.setSeconds(totalSeconds % 60);
        } else
            myTime.setSeconds(totalSeconds);

    }

}
