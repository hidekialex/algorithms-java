package com.hacker.rank.java.strings;

import java.util.Scanner;

public class _0_JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    static class MyRegex {
        private String ipRange = "\\b(\\d{1,2}|0\\d{1,2}|1\\d{1,2}|2[0-4]\\d|25[0-5])\\b";
        private String point = "\\.";
        public String pattern = ipRange.concat(point).concat(ipRange).concat(point).concat(ipRange).concat(point).concat(ipRange);
    }
}
