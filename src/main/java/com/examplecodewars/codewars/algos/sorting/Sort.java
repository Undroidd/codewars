package com.examplecodewars.codewars.algos.sorting;

public class Sort {

    // O(n2)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // O(n2)
    public static void g(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    //o (nlogn) {5, 3, 2, 1, 4} {5, 3} {2, 1, 4} {5} {3} , {2} {1, 4}
    //separa array pana ajung arrayuri cate elemente sunt(one element array) apoi merge
    public static void mergeSort(int[] arr) {
        if(arr.length > 1) {
            int mid = arr.length / 2;

            int[] l = new int[mid];
            int[] r = new int[arr.length - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                r[i - mid] = arr[i];
            }

            mergeSort(l);
            mergeSort(r);

            merge(arr, l, r, mid, arr.length - mid);
        }
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    //worst case n2
    //pivot selection
    public static void quicksort(int[] arr) {

    }
}
