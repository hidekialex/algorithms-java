package com.hacker.rank.implementation;

public class _2_Encryption {

    static int round(double d){
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        double result = dAbs - (double) i;
        if(result<0.5){
            return d<0 ? -i : i;
        }else{
            return d<0 ? -(i+1) : i+1;
        }
    }

    static String encryption(String s) {

        String processed = s.replaceAll("\\s", "");

        double sqrtValue = Math.sqrt(processed.length());

        int rows = (int) Math.sqrt(processed.length());

        int columns = 0;
        if ((sqrtValue - rows) > 0.5) {
            columns = ++rows;
        } else if((sqrtValue - rows) == 0) {
            columns = rows;
        } else {
            columns = rows+1;
        }

        int rest = processed.length() % columns;

        String[] chunkWords = new String[columns];
        for(int i=0; i<rows;i++) {
            int firstPosition = i*columns;
            int lastPosition = 0;

            if(rows == columns) {
                lastPosition = (i==columns-1 && rest != 0) ? firstPosition+rest : firstPosition+columns;
            } else {
                lastPosition = (i==columns-2 && rest != 0) ? firstPosition+rest : firstPosition+columns;
            }

            String chunkWord = processed.substring(firstPosition, lastPosition);
            chunkWords[i] = chunkWord;
        }

        String[] encryptedValues = new String[columns];
        for(int j=0; j<rows;j++) {
            for(int x=0; x<columns; x++) {
                if(x == chunkWords[j].length()) {
                    break;
                }
                String letter = String.valueOf(chunkWords[j].charAt(x));
                encryptedValues[x] = encryptedValues[x] == null ? letter : encryptedValues[x]+letter;
            }
        }

        String result = "";
        for(int y=0; y<encryptedValues.length; y++) {
            result += encryptedValues[y]+" ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String encryption = _2_Encryption.encryption("chillout");
        System.out.println(encryption);
    }
}
