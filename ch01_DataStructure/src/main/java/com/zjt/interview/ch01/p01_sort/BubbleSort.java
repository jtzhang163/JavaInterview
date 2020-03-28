package com.zjt.interview.ch01.p01_sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(long arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        long[] arr = new long[]{4, 6, 8, 2, 1, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
