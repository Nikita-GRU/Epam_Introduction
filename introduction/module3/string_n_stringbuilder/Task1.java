package epam.introduction.module3.string_n_stringbuilder;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public static void main(String[] args) {
        String string = "   ae fhuf 1fnu jnf        54f3f2moif    2m222..(#*ee2  ";
        int maxOfSpacesInRow = 0;
        int spacesInRow;
        for (int i = 0; i < string.length(); i++) {
            spacesInRow = 0;
            if (string.charAt(i) == ' ') {
                int j = i;
                while (j<string.length() && string.charAt(j) == ' ') {
                    spacesInRow++;
                    j++;
                }
            }
            if (spacesInRow > maxOfSpacesInRow)
                maxOfSpacesInRow = spacesInRow;
        }
        System.out.println("maxOfSpacesInRow = " + maxOfSpacesInRow);
    }
}
