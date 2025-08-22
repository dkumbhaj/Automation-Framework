package com.Utils;

import java.util.Arrays;
public class stringCheck {
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
    public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

