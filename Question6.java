package com.company;

import java.util.Scanner;

public class Question6 {

    static void countFrequencies(int arr[]) {
        int b[] = new int[arr.length];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (b[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && b[j] == 0) {
                    count++;
                    b[j] = 1;
                }
            }
            System.out.println(arr[i] + " " + count);
            count = 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        countFrequencies(arr);
    }
}
