package com.examples;

public class _0_InverterPalavrasSemUsarAuxiliares {

    static void invert(String value) {
        char[] chars = value.toCharArray();
        int i = 0;
        int j = chars.length;
        while(i < j) {
            int sum = (int)chars[i] + (int)chars[j-1];
            chars[i] = (char)(sum - (int)chars[i]);
            chars[j-1] = (char)(sum - (int)chars[j-1]);
            i++;
            j--;
        }
        System.out.println(new String(chars));
    }

    public static void main(String[] args) {
        _0_InverterPalavrasSemUsarAuxiliares.invert("Alexandre");
    }
}
