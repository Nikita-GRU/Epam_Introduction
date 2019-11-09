package epam.introduction.module3.regex;
//1.   Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом
//     три  различных  операции:
//      *отсортировать  абзацы  по  количеству  предложений;
//      *в  каждом  предложении  отсортировать  слова  по  длине;
//      *отсортировать лексемы в  предложении  по убыванию количества вхождений заданного символа, а в случае равенства
//     –  по  алфавиту.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String text = "В тот момент, когда упырица, напрягшись, прыгнула, цепь просвистела в воздухе и, свернувшись змеей, мгновенно оплела руки, шею и голову чудища. Не довершив прыжка, упырица упала, издав пронзительный визг. Она извивалась на полу, жутко рыча то ли от ярости, то ли от палящей боли, причиняемой ненавистным металлом. Геральт был удовлетворен — убить упырицу, если б он того хотел, не составляло труда. Но он не доставал меча. Пока ничто в поведении упырицы не говорило о том, что это случай неизлечимый. Геральт немного отступил и, не спуская глаз с извивающегося на полу тела, глубоко дышал, собираясь с силами.\n" +

                "Цепь лопнула, серебряные звенья дождем прыснули во все стороны, звеня по камням. Ослепленная яростью упырица, воя, кинулась в атаку. Геральт спокойно ждал и поднятой правой рукой чертил перед собой Знак Аард.\n" +

                "Упырица отлетела на несколько шагов, словно ее ударили молотом, но удержалась на ногах, выставила когти, обнажила клыки. Ее волосы поднялись дыбом, зашевелились так, будто она шла против резкого ветра. С трудом, кашляя, шаг за шагом, медленно, но шла! Все–таки шла!";

        System.out.println("text = " + sortLexemes(text, 'е'));
    }

    //      *отсортировать  абзацы  по  количеству  предложений;
    public static String sortBySentenceCountInParagraphs(String text) {

        List<String> pars = new ArrayList<>();
        for (String str : getParagraphs(text)
        ) {
            pars.add(str);
        }
        pars.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer o1Sentences = 0;
                Integer o2Sentences = 0;
                for (char ch : o1.toCharArray()
                ) {
                    if (ch == '.' || ch == '?' || ch == '!')
                        o1Sentences++;
                }
                for (char ch : o2.toCharArray()
                ) {
                    if (ch == '.' || ch == '?' || ch == '!')
                        o2Sentences++;
                }
                return o1Sentences.compareTo(o2Sentences);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : pars
        ) {
            stringBuilder.append(str);
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    //      *в  каждом  предложении  отсортировать  слова  по  длине;
    public static String sortWordsByLength(String text) {

        StringBuilder stringBuilder = new StringBuilder();
        for (String paragraph : getParagraphs(text)
        ) {
            for (String sentence : getSentencesFromParagraph(paragraph)
            ) {
                List<String> words = new ArrayList<>();
                for (String word : getWordsFromSentence(sentence)
                ) {
                    words.add(word);
                }
                words.sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
                    }
                });
                for (String word : words
                ) {
                    stringBuilder.append(word);
                    stringBuilder.append(' ');
                }
                stringBuilder.append('.');

            }
            stringBuilder.append('\n');
        }

        return stringBuilder.toString();
    }

    //      *отсортировать лексемы в  предложении  по убыванию количества вхождений заданного символа, а в случае равенства
//     –  по  алфавиту.
    public static String sortLexemes(String text, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String paragraph : getParagraphs(text)
        ) {
            for (String sentence : getSentencesFromParagraph(paragraph)
            ) {
                List<String> words = new ArrayList<>();
                for (String word : getWordsFromSentence(sentence)
                ) {
                    words.add(word);
                }
                words.sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        Integer o1LexemeCount = 0;
                        Integer o2LexemeCount = 0;
                        for (char c : o1.toCharArray()
                        ) {
                            if (c == ch)
                                o1LexemeCount++;
                        }
                        for (char c : o2.toCharArray()
                        ) {
                            if (c == ch)
                                o2LexemeCount++;
                        }
                        if (o1LexemeCount != o2LexemeCount)
                            return -o1LexemeCount.compareTo(o2LexemeCount);
                        else
                            return o1.compareTo(o2);
                    }
                });
                for (String word : words
                ) {
                    stringBuilder.append(word);
                    stringBuilder.append(' ');
                }
                stringBuilder.append('.');

            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    public static String[] getParagraphs(String text) {
        return text.split("\n");
    }

    public static String[] getSentencesFromParagraph(String paragraph) {
        return paragraph.split("[!.?]");
    }

    public static String[] getWordsFromSentence(String sentence) {
        return sentence.split(" |, ");
    }


}
