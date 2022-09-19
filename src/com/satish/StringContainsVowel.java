package com.satish;

public class StringContainsVowel {
    public static void main(String[] args) {
        System.out.println(stringContainsVowel("Hello"));
    }

    public static boolean stringContainsVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

