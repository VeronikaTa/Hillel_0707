package Workshops.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// как проверить email на валидность


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    public static void main(String[] args) {

        final String string = "kjhkjh@sdfdsf.sdf";

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(string);

        if (matcher.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is not valid");
        }

    }
}





