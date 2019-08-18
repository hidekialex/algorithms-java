package com.hacker.rank.implementation;

public class _6_CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {

        int distanceCat1 = Math.abs(z - x);
        int distanceCat2 = Math.abs(z - y);

        String result = "";
        if(distanceCat1 == distanceCat2) {
            result = "Mouse C";
        } else if (distanceCat1 < distanceCat2) {
            result = "Cat A";
        } else if (distanceCat1 > distanceCat2) {
            result = "Cat B";
        }
        return result;
    }

    public static void main(String[] args) {
        String s = _6_CatsAndAMouse.catAndMouse(1, 3, 2);
        System.out.println(s);
    }
}
