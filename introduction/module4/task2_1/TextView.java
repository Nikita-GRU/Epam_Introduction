package epam.introduction.module4.task2_1;
//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.Iterator;

public class TextView {
    public TextView() {
    }

    public void printText(Text text) {
        System.out.println(text.getTitle() + ":");
        for (Sentence sentence : text.getSentences()
        ) {
            printSentence(sentence);
            System.out.print(". "); //dot in the end of sentence
        }
    }

    public void printSentence(Sentence sentence) {
        //making first word from the uppercase letter
        String startOfSentence = sentence.getWords().get(0).getWord();
        String str = startOfSentence.substring(0, 1).toUpperCase() + startOfSentence.substring(1);
        Iterator<Word> iterator = sentence.getWords().iterator();
        System.out.print(str); //printing modified first word
        iterator.next(); // and skipping it's former
        if (iterator.hasNext()) // checking the oneword sentence ( to avoid unwanted spaceKey)
            System.out.print(" ");
        while (iterator.hasNext()) {
            printWord(iterator.next());
            if (iterator.hasNext())
                System.out.print(" ");//adding spaceKeys between words
        }

    }

    public void printWord(Word word) {
        System.out.print(word.getWord());
    }
}
