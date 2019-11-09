package epam.introduction.module3.char_array;

//3. В строке найти количество цифр.
public class Task3 {
    public static void main(String[] args) {
        String string = "aefhuf1fnujnf54f3f2moif2m222..(#*ee2";
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int digitCounter = 0;
        for (char ch : string.toCharArray()
        ) {
            for (char digit : digits
            ) {
                if (ch == digit)
                    digitCounter++;
            }
        }
        System.out.println("digitCounter = " + digitCounter);
    }
}
