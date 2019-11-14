package com.company;

public class Question2 {

    private static void reverseString(char c[]) {
        int start = 0;
        int end = c.length - 1;

        while (start < end) {
            if (!Character.isAlphabetic(c[start])) {
                start++;
            }
            else if (!Character.isAlphabetic(c[end])) {
                end--;
            }else {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        String s = "a,b$c";
        char ch[] = s.toCharArray();
        reverseString(ch);
        String reversed = new String(ch);
        System.out.println(reversed);
    }
}
