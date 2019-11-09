package epam.introduction.module3.regex;
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
//
//  xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
//
//  тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        String xmlText = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String xmlAnalysis = getXMLNodes(xmlText);
        System.out.println(xmlAnalysis);
    }

    private static String getXMLNodes(String xml) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern openTag = Pattern.compile("<\\w.+?>");
        Pattern closeTag = Pattern.compile("</\\w+>");
        Pattern body = Pattern.compile(">.+?<");
        Pattern empty = Pattern.compile("<\\w.+?/>");
        String[] lines = xml.split("\n\\s*");
        for (String line : lines) {
            Matcher openTagMatcher = openTag.matcher(line);
            Matcher closeTagMatcher = closeTag.matcher(line);
            Matcher bodyMatcher = body.matcher(line);
            Matcher emptyMatcher = empty.matcher(line);
            if (emptyMatcher.find()) {
                strBuilder.append(emptyMatcher.group());
                strBuilder.append(" //tag without body\n");
            } else if (openTagMatcher.find()) {
                strBuilder.append(openTagMatcher.group());
                strBuilder.append(" //opening tag\n");
            }
            if (bodyMatcher.find()) {
                strBuilder.append(bodyMatcher.group().substring(1));
                strBuilder.append("\b //tag value\n");
            }
            if (closeTagMatcher.find()) {
                strBuilder.append(closeTagMatcher.group());
                strBuilder.append(" //closing tag\n");
            }
        }
        return strBuilder.toString();
    }
}

