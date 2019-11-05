package epam.introduction.module4.task1_6;

//6.  Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
//заданное количество часов, минут и секунд.
public class MyTimeView {
    public MyTimeView() {
    }

    //just because we have hours, minutes and seconds as int, we need to format it for a comfortable view "00h00m00s"
    public void printMyTime(MyTime myTime) {
        if (myTime.getHours() < 10)
            System.out.print("0" + myTime.getHours());
        else System.out.print(myTime.getHours());

        System.out.print(":");

        if (myTime.getMinutes() < 10)
            System.out.print("0" + myTime.getMinutes());
        else System.out.print(myTime.getMinutes());

        System.out.print(":");

        if (myTime.getSeconds() < 10)
            System.out.println("0" + myTime.getSeconds());
        else System.out.println(myTime.getSeconds());

    }
}

