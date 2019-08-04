package com.hacker.rank.dictionariesandhashmaps;

import java.util.HashSet;
import java.util.Set;

public class _0_TwoStrings {

    static String twoStrings(String s1, String s2) {

        char[] biggerString;
        char[] smallerString;
        if (s1.length() > s2.length()) {
            biggerString = s1.toCharArray();
            smallerString = s2.toCharArray();
        } else {
            biggerString = s2.toCharArray();
            smallerString = s1.toCharArray();
        }
        Set<Character> verifiedSmallerArrayChars = new HashSet<>();
        Set<Character> verifiedBiggerArrayChars = new HashSet<>();
        boolean verified = false;
        for (int i = 0; i < biggerString.length; i++) {

            if(verifiedBiggerArrayChars.contains(biggerString[i])) {
                continue;
            }
            verifiedBiggerArrayChars.add(biggerString[i]);

            if(verifiedSmallerArrayChars.contains(biggerString[i])) {
                return "YES";
            } else if(verified) {
                continue;
            }
            for (int j = 0; j < smallerString.length; j++) {
                if (biggerString[i] == smallerString[j]) {
                    return "YES";
                }
                verifiedSmallerArrayChars.add(smallerString[j]);
            }
            verified = true;
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s = _0_TwoStrings.twoStrings("hackerrankcommunity", "cdecdecdecde");
        System.out.println(s);
    }
}