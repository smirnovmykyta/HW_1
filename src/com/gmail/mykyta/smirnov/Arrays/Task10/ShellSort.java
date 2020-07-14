package com.gmail.mykyta.smirnov.Arrays.Task10;

public class ShellSort {
    public static int[] sortShell(int array[]) {
        int n = array.length;
        for (int g = n / 2; g > 0; g /= 2) {
            for (int i = g; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= g && array[j - g] > temp; j -= g)
                    array[j] = array[j - g];
                array[j] = temp;
            }
        }
        return array;
    }
}
