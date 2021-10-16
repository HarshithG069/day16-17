package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {
    public static void main (String[] args){
        int a[] = {154,2,69,57,54,99,74};
        InsertionSort i1 = new InsertionSort();
        System.out.println("\nBefore sorting array elements are - ");
        i1.printArr(a);
        i1.insert(a);
        System.out.println("\n\nAfter sorting array elements are - ");
        i1.printArr(a);
        System.out.println();
    }
        void insert(int a[])
        {
            int i, j, temp;
            int n = a.length;
            for (i = 1; i < n; i++) {
                temp = a[i];
                j = i - 1;

                while (j >= 0 && temp <= a[j])
                {
                    a[j + 1] = a[j];
                    j = j - 1;
                }
                a[j + 1] = temp;
            }
        }
        void printArr(int a[])
        {
            int i;
            int n = a.length;
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
        }



}
