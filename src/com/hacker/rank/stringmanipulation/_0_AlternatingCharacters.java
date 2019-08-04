package com.hacker.rank.stringmanipulation;

public class _0_AlternatingCharacters {

    static int alternatingCharacters(String s) {

        char a = 'A';
        char b = 'B';
        char next = 0;

        char[] letters = s.toCharArray();
        int deleted = 0;
        for(int i=0; i<letters.length; i++) {
            if(i == 0) {
                next = letters[i] == a ? b : a;
                continue;
            }
            if(letters[i] == next) {
                next = letters[i] == a ? b : a;
            } else {
                deleted++;
            }
        }
        return deleted;
    }

    public static void main(String[] args) {
        int result = _0_AlternatingCharacters.alternatingCharacters("BBBBB");
        System.out.println(result);
    }
}
