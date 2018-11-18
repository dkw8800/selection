package com.company;

public class DWongLib {

    public static void selectionsort(int[] arr) {
        int min = 0;
        int temp =  0;

        for(int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int k = i; k < arr.length; k++) {
                if (arr[k] < min) {
                    min = arr[k];
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
}
