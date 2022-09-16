package Workshops.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        final String regex = "(\\+380|0)\\d{9}";
        final String string = "Мова значно запозичила синтаксис 0979999999із C і C++. \" +\n"
                + "                \"Зокрема, взято за основу об'єктну модель С++, проте \" +\n"
                + "                \"її модифіковано. Усунуто можливіс+380660112233ть \" +\n"
                + "                \"появи деяких конфліктних ситуацій, що могли виникнути через помилки \" +\n"
                + "                \"прогр+380456546845аміста та полегш07833829060ено сам процес розробки об'єктно-орієнтованих\n\n";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
