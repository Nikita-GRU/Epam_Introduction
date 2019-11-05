package epam.introduction.module4.task1_6;

//6.  Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
//заданное количество часов, минут и секунд.
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;

    public MyTime() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public MyTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public MyTime(String formattedTime) {
        if (formattedTime.matches((new String("^(0[0-9]|1[0-9]|2[0-3]|[0-9]):([0-5][0-9]):([0-5][0-9])$")))) {
            String[] s = formattedTime.split(":");
            setHours(Integer.parseInt(s[0]));
            setMinutes(Integer.parseInt(s[1]));
            setSeconds(Integer.parseInt(s[2]));
        } else {
            setHours(0);
            setMinutes(0);
            setSeconds(0);
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 24 || hours < 0)
            hours = 0;
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60 || minutes < 0)
            minutes = 0;
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60 || seconds < 0)
            seconds = 0;
        this.seconds = seconds;
    }


}
