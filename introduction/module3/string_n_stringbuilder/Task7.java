package epam.introduction.module3.string_n_stringbuilder;

import java.util.Scanner;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            // skipping ' '
            if (string.charAt(i) == ' ') {
            } else {
                //finding new chars for our stringBuilder
                char ch = string.charAt(i);
                boolean isNewChar = true;
                for (char ch1 : stringBuilder.toString().toCharArray()) {
                    if (ch == ch1)
                        isNewChar = false;
                }
                if (isNewChar)
                    stringBuilder.append(string.charAt(i));
            }
        }
        System.out.println("Initial string = " + string);
        System.out.println("stringBuilder = " + stringBuilder.toString());
    }
}
