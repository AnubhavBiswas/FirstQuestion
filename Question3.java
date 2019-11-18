package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Question3 {

    static boolean balancedParentheses(char a[]) {

        Stack<Character> s = new Stack<>();

        for (int i  =0; i < a.length; i++) {
            if (a[i] == '[' || a[i] == '{' || a[i] == '(') {
                s.push(a[i]);
            }

            else if (a[i] == ']' || a[i] == '}' || a[i] == ')') {

                if (s.isEmpty()) {
                    return false;
                }

                else if (a[i] == ']' && s.peek() == '[') {
                    s.pop();
                }

                else if (a[i] == '}' && s.peek() == '{') {
                    s.pop();
                }

                else if (a[i] == ')' && s.peek() == '(') {
                    s.pop();
                }

                else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char a[] = new char[n];
        for (int i = 0; i < n; i++) {
            char c = scanner.next().charAt(0);
            a[i] = c;
        }

        if (balancedParentheses(a) == true) {
            System.out.println("Balanced");
        }else {
            System.out.println("Not balanced");
        }
    }
}