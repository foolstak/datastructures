package com.foolstak.sorting;

public class InsertionSort {

    public static int[] sort(int[] arrayToBeSorted) {
        int key, i;
        for (int j = 1; j < arrayToBeSorted.length; j++) {
            key = arrayToBeSorted[j];
            i = j - 1;
            while ((i >= 0) && (arrayToBeSorted[i] > key)) {
                arrayToBeSorted[i + 1] = arrayToBeSorted[i];
                i = i - 1;
            }
            arrayToBeSorted[i + 1] = key;
        }
        return arrayToBeSorted;
    }
}
