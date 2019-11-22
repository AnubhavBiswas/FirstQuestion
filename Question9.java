package com.company;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
        int k=s1.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        int c=arr[0];
        System.out.println("Max count is:");
        for(int i=k;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(c<arr[j])
                {
                    c=arr[j];
                }
            }
            System.out.println(c);
            c=arr[0];
        }
    }

}
