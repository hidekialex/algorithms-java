package com.hacker.rank.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_JavaRegex2DuplicateWords {

    public static void main(String[] args) {
        String line = "in inthe";
        String pattern = "\\b(\\w+)\\b\\s(\\1)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        while(m.find()) {
            line = line.replaceAll(m.group(0), m.group(1));
        }
        System.out.println(line);
    }
}
