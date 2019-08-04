package com.hacker.rank.dictionariesandhashmaps;

import java.util.Arrays;

public class _1_ShelockAndAnagrams {

    static int sherlockAndAnagrams(String s) {

        int size = s.length();
        int countAnagram = 0;
        for(int i=1; i<size; i++) {
            for(int j=i; j<size; j++) {
                char[] subLettersBegin = s.substring(i-1, size - (size-j)).toCharArray();
                String subStringToCompare = s.substring(i, size);
                int pass = (subStringToCompare.length()-subLettersBegin.length);
                for(int x=0; x <= pass; x++) {
                    char[] subLettersToCompare = subStringToCompare.substring(x, x+subLettersBegin.length).toCharArray();
                    Arrays.sort(subLettersBegin);
                    Arrays.sort(subLettersToCompare);

                    if(String.valueOf(subLettersBegin).equals(String.valueOf(subLettersToCompare))) {
                        countAnagram++;
                    }
                }
            }
        }
        return countAnagram;
    }

    public static void main(String[] args) {
        int result = _1_ShelockAndAnagrams.sherlockAndAnagrams("cdcd");
        System.out.println(result);
    }
}
