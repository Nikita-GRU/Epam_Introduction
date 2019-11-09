package epam.introduction.module3.char_array;

//4. В строке найти количество чисел.
public class Task4 {
    public static void main(String[] args) {
        String string = "aefhuf1fnujnf54f3f2moif2m222..(#*ee2";
        int numberCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isDigit(string.charAt(i))) {
                if (i == string.length() - 1 || isDigit(string.charAt(i + 1)) == false) {
                    numberCounter++;
                }
            }
        }
        System.out.println("numberCounter = " + numberCounter);
    }

    public static boolean isDigit(char ch) {
        boolean isDigit = false;
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char digit : digits
        ) {
            if (ch == digit) {
                isDigit = true;
            }
        }
        return isDigit;
    }
}
