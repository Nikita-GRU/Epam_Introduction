package epam.introduction.module3.string_n_stringbuilder;

//2. В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public static void main(String[] args) {
        String string = "ashbnflalalaaaamfmdkdmaaawwakxma";
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : string.toCharArray()
        ) {
            if (ch == 'a') {
                stringBuilder.append(ch);
                stringBuilder.append('b');
            } else
                stringBuilder.append(ch);
        }
        System.out.println("stringBuilder = " + stringBuilder.toString());
    }
}
