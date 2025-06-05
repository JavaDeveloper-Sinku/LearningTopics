package Learing;

import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        String text = "i am learning java";
        //removing all whitespace
        text.replaceAll("\\s+","");

        System.out.println(text);
        text.split("\\|");
        text.split(Pattern.quote("|"));
        System.out.println(
                text
        );

    }
}
