package com.foolstak.sorting;

public class MergeSort {

    public int[] sort(int[] stringArray){
        return mergeSort(stringArray, 0, stringArray.length);
    }

    private int[] mergeSort(int[] stringArray, int start, int end) {
        int q = 0;
        if(start < end){
            q = (start + end) / 2;
            mergeSort(stringArray, start, q);
            mergeSort(stringArray, q, end);
            merge(stringArray, start, q, end);
        }
        return stringArray;
    }

    private void merge(int[] stringArray, int start, int mid, int end) {
        int n1 = mid - start +1 ;
        int n2 = end - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int t = 0;
        for(int i = start; i < mid; i++){
            arr1[t++] = stringArray[i];
        }
        t = 0;
        for(int j = mid; j < end; j++){
            arr2[t++] = stringArray[j];
        }
        int i = 0, j = 0;
        for(int k = start; k < end; k++){
            if(arr1[i] < arr2[j]){
                stringArray[k] = arr1[i];
                i++;
            }
            else{
                stringArray[k] = arr2[j];
                j++;
            }
        }
    }
}
