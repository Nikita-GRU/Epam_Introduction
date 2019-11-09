package epam.introduction.module3.char_array;

//5. Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить
// на  одиночные  пробелы.
//     Крайние пробелы в строке удалить.
public class Task5 {
    public static void main(String[] args) {
        String string = "   ae fhuf 1fnu jnf              54f3f2moif    2m222..(#*ee2  ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                if (i == string.length() - 1 || string.charAt(i + 1) != ' ')
                    stringBuilder.append(string.charAt(i));
            } else
                stringBuilder.append(string.charAt(i));
        }
        System.out.println("stringBuilder =" + stringBuilder.toString().trim());
    }


}
