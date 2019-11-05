package epam.introduction.module4.task2_1;
//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.List;

public class TextConstructor {
    public TextConstructor() {
    }

    public void addSentence(Text text, Sentence sentence) {
        List<Sentence> newText = new ArrayList<>();

        for (Sentence s : text.getSentences()
        ) {
            newText.add(s);
        }
        newText.add(sentence);
        text.setSentences(newText);
    }
}
