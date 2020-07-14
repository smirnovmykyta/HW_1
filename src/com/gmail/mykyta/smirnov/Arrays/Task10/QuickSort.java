package com.gmail.mykyta.smirnov.Arrays.Task10;

public class QuickSort {
    public void quickSort(int [] arr, int lowIndex, int highIndex){
        if(lowIndex < highIndex){
            int pivot = partition(arr, lowIndex, highIndex);

            quickSort(arr, lowIndex, pivot -1 );
            quickSort(arr, pivot + 1, highIndex );
        }
    }

    public int partition(int arr[], int lowIndex, int highIndex){
        int pivot = arr[highIndex];
        int i = (lowIndex - 1);
        for(int j = lowIndex; j < highIndex; j++){
            if(arr[j] < pivot){
                i++;

                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int swap = arr[i+1];
        arr[i+1] = arr[highIndex];
        arr[highIndex] = swap;

        return i+1;
    }
}
