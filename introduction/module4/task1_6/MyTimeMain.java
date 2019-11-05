package epam.introduction.module4.task1_6;

//6.  Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
//заданное количество часов, минут и секунд.
public class MyTimeMain {
    public static void main(String[] args) {
        MyTime myTime = new MyTime("11:22:55");
        MyTimeView myTimeView = new MyTimeView();
        MyTimeLogic myTimeLogic = new MyTimeLogic();

        myTimeView.printMyTime(myTime);

        myTimeLogic.addHours(54, myTime);
        myTimeView.printMyTime(myTime);
        myTimeLogic.addMinutes(100, myTime);
        myTimeView.printMyTime(myTime);
        myTimeLogic.addSeconds(1000, myTime);
        myTimeView.printMyTime(myTime);

        myTime.setSeconds(77);
        myTime.setHours(25);
        myTime.setMinutes(88);
        myTimeView.printMyTime(myTime);
    }
}
