package epam.introduction.module3.char_array;

import java.util.Arrays;
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static void main(String[] args) {
        String[] camelCaseVars = new String[]{"var", "varBigger", "varMuchMoreBigger"};
        String[] snake_case_vars = new String[camelCaseVars.length];
        int stringIteration = 0;
        for (String str : camelCaseVars) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : str.toCharArray()
            ) {
                if (!Character.isUpperCase(c))
                    stringBuilder.append(c);
                else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
            snake_case_vars[stringIteration] = stringBuilder.toString();
            stringIteration++;
        }
        System.out.println(Arrays.toString(snake_case_vars));
    }
}
