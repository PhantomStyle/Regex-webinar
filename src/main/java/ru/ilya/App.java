package ru.ilya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
//        String str = "qwe123";
//        System.out.println(str.replaceAll("\\d+", "asd"));
//        System.out.println(str.replace("123", "asd"));
//        System.out.println("11gdfgdf11".matches("\\w+"));


//        System.out.println("gfg111".replace("\\d+", ""));

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("666666gggggg7777bbbbbvbbv99999");
        StringBuffer stringBuffer = new StringBuffer();
//        while (matcher.find()) {
//            matcher.appendReplacement(stringBuffer, "kek").appendTail(stringBuffer);
//            System.out.println(matcher.group());
//        if(matcher.find()) {
//            System.out.println(matcher.replaceFirst("gdfgdf"));
//            System.out.println("Start: " + matcher.start());
//            System.out.println("End: " + matcher.end());
//        }
//        }
        if (matcher.find()) {
            System.out.println(matcher.group());
            matcher.appendReplacement(stringBuffer, "kek");
        }
        if (matcher.find()) {
            System.out.println(matcher.group());
            matcher.appendReplacement(stringBuffer, "qwerty").appendTail(stringBuffer);
        }

        System.out.println(stringBuffer);
    }
}
