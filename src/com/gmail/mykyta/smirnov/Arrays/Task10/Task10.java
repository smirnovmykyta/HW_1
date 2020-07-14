package com.gmail.mykyta.smirnov.Arrays.Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        ShellSort obShellSort = new ShellSort();
        System.out.println(Arrays.toString(obShellSort.sortShell(array)));
        HeapSort obHeapSort = new HeapSort();
        System.out.println(Arrays.toString(obHeapSort.heapSort(array)));
        MergeSort obMergeSort = new MergeSort();
        obMergeSort.mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
        QuickSort obQuickSort  = new QuickSort();
        obQuickSort.quickSort(array, 0,array.length - 1);
        System.out.println(Arrays.toString(array));




    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива");
        int a =  Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++){
            System.out.println("Введите " + (i + 1) + " элемент массива");
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return array;
    }





}
