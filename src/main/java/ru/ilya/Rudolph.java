package ru.ilya;

import java.util.regex.Pattern;

public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[]{"Rudolph",
                "[r]udolph", "[rR][aeiou][a-z]ol.*", "R.*"}) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
