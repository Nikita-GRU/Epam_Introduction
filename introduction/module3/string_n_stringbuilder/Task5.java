package epam.introduction.module3.string_n_stringbuilder;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public static void main(String[] args) {
        String string = "ashbnflalalaaaamfmdkdmaaawwakxma";
        int aCounter = 0;
        for (char ch : string.toCharArray()
        ) {
            if (ch == 'a')
                aCounter++;
        }
        System.out.println("aCounter = " + aCounter);
    }
}
