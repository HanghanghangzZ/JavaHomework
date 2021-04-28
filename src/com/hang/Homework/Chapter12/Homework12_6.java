package com.hang.Homework.Chapter12;

public class Homework12_6 {
    public static void main(String[] args) {
        hexToDecimal("zzzz");
    }

    private static boolean isHexNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == 'A' || c == 'B' || c == 'C' ||
                    c == 'D' || c == 'E' || c == 'F' || c == 'a' || c == 'b' || c == 'c' || c == 'c' || c == 'd' || c == 'e' || c == 'f') {
                continue;
            } else {
                throw new NumberFormatException("String is not hex");
            }
        }
        return true;
    }

    public static int hexToDecimal(String hex) {
        isHexNumber(hex);

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
