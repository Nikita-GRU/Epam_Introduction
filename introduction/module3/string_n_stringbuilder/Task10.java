package epam.introduction.module3.string_n_stringbuilder;
//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X .
public class Task10 {
    public static void main(String[] args) {
        String string = "Vedaedad.addawdawd?dwqdawdaw!d!d,dd.wqdqw!cc?cc?";
        int sentenceCounter = 0;
        for (char ch : string.toCharArray()
        ) {
            if (ch == '.' || ch == '?' || ch == '!')
                sentenceCounter++;
        }
        System.out.println("sentenceCounter = " + sentenceCounter);
    }
}
