package epam.introduction.module4.task2_1;

import java.util.Arrays;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class TextMain {
    public static void main(String[] args) {
        TextView textView = new TextView();
        TextConstructor textConstructor = new TextConstructor();
        Text text = new Text("First", Arrays.asList(
                new Sentence(Arrays.asList(new Word("hello"), new Word("kitty"))),
                new Sentence(Arrays.asList(new Word("i"), new Word("missed"), new Word("u"),
                        new Word("so"), new Word("much"))),
                new Sentence(Arrays.asList(new Word("bye")))));



        textConstructor.addSentence(text, new Sentence(Arrays.asList(
                new Word("see"), new Word("you"), new Word("next"), new Word("time"))));
        textView.printText(text);
    }
}
