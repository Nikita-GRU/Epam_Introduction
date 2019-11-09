package epam.introduction.module3.string_n_stringbuilder;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task4 {
    public static void main(String[] args) {
        String string = "информатика";
        System.out.println(new String(string.charAt(7) + string.substring(3, 5) + string.charAt(7)));

    }
}
