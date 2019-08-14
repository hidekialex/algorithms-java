package com.hacker.rank.implementation;

public class _3_TheTimeInWords {

    static String[] numbers = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine"
    };

    static String timeInWords(int h, int m) {

        if(m == 0) {
            return numbers[h] + " o' clock";
        } else if(m >= 1 && m <= 30) {
            String plural = (m > 1) ? "s": "";
            if(m == 15) {
                return "quarter past "+numbers[h];
            } else if(m == 30) {
                return "half past "+numbers[h];
            }
            return numbers[m]+" minute"+plural+" past "+numbers[h];
        } else if(m > 30) {
            int minutesTo = 60 - m;
            if(h == 12) {
                h=1;
            } else {
                h = h+1;
            }
            if(minutesTo == 15) {
                return "quarter to "+numbers[h];
            }
            return numbers[minutesTo]+" minutes to "+numbers[h];
        }
        return "";
    }

    public static void main(String[] args) {
        String timeInWords = _3_TheTimeInWords.timeInWords(5, 28);
        System.out.println(timeInWords);
    }
}
