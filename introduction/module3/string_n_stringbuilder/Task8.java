package epam.introduction.module3.string_n_stringbuilder;

import java.util.Scanner;

//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        String[] words = string.split(" ");
        String maxWord = "";
        for (String word : words
        ) {
            if (maxWord.length() < word.length())
                maxWord = word;
        }
        System.out.println("maxWord = " + maxWord);
    }
}
