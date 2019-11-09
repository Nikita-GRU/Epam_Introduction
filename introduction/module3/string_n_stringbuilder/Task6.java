package epam.introduction.module3.string_n_stringbuilder;

//6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public static void main(String[] args) {
        String string = "ashbnflalalaaaamfmdkdmaaawwakxma";
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : string.toCharArray()
        ) {
            stringBuilder.append(ch);
            stringBuilder.append(ch);
        }
        System.out.println("stringBuilder = " + stringBuilder.toString());
    }
}
