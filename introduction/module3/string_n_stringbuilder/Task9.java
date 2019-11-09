package epam.introduction.module3.string_n_stringbuilder;
//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.  65-90 && 97-122

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        int lowerCaseCounter = 0;
        int upperCaseCounter = 0;
        for (char ch : string.toCharArray()
        ) {
            if (ch > 64 && ch < 91)
                upperCaseCounter++;
            if (ch > 96 && ch < 123)
                lowerCaseCounter++;
        }
        System.out.println("upperCaseCounter = " + upperCaseCounter);
        System.out.println("lowerCaseCounter = " + lowerCaseCounter);
            }
}
