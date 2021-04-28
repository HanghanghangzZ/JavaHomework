package com.hang.Homework.Chapter11;

import java.util.ArrayList;

public class Homework1118 {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(toCharacterArray(s));
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> ret = new ArrayList<>();

        for (char c : chars) {
            ret.add(c);
        }

        return ret;
    }
}
