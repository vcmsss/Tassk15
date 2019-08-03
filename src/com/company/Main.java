package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {10, 5, 325, 3, 43, 532, 65, 36, 35,96};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}