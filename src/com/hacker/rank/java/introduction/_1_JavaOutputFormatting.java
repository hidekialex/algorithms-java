package com.hacker.rank.java.introduction;

import com.sun.deploy.util.StringUtils;

public class _1_JavaOutputFormatting {

    public static void main(String[] args) {
        String value1 = "java";
        int value2 = 100;

        String outputValue = value1;
        for(int i=value1.length(); i<=15; i++) {
            outputValue += " ";
        }

        if(value2 < 100) {
            System.out.println(outputValue+"0"+value2);
        } else if(value2 == 0){
            System.out.println(outputValue+"00"+value2);
        } else {
            System.out.println(outputValue + value2);
        }
    }
}
