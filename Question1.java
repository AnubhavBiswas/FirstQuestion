package com.company;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int arr[] = new int[n];

	    for (int i = 0; i < n; i++) {
	        arr[i] = scanner.nextInt();
        }

	    int sum = 0;
	    int count = 0;
	    int num = scanner.nextInt();

	    for (int i  =0; i < n; i++) {
	    	for (int j = i; j < n; j++) {
	    		sum += arr[j];
	    		if (sum == num) {
					System.out.println("Start: " + i + " and End: " + j);
				}
	    		else {
	    			sum = 0;
				}
			}
		}
    }
}
