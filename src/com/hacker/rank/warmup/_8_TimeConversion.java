package com.hacker.rank.warmup;

import com.sun.javaws.jnl.RContentDesc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _8_TimeConversion {

    static String timeConversion(String s) {

        String pattern = "^(0[0-9]|1[0-2]):[0-5][0-9]:[0-5][0-9]([PA]M)$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);

        String result = "";
        if(m.find()) {
            Integer convertedHour = 0;
            if("AM".equals(m.group(2))) {
                convertedHour = Integer.parseInt(m.group(1));
            } else if ("PM".equals(m.group(2))) {
                convertedHour = Integer.parseInt(m.group(1));
                if(convertedHour != 12) {
                    convertedHour += 12;
                }
            }
            String convertedHourString = convertedHour.toString();
            if(convertedHour.equals(12) && "AM".equals(m.group(2))) {
                convertedHourString = "00";
            } else if (convertedHour < 10) {
                convertedHourString = "0"+convertedHour;
            }
            result = s.replaceAll(m.group(2), "")
                    .replaceAll(m.group(1), convertedHourString);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = _8_TimeConversion.timeConversion("12:45:54PM");
        System.out.println(s);
    }
}
