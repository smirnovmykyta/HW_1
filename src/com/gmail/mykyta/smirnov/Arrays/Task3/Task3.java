package com.gmail.mykyta.smirnov.Arrays.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int ind = min(array);
        System.out.println("Индекс минимального числа = " + ind);
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

    public static int min(int[] array) {
        int min = array[0];
        int j = 0;
        for(int i = 1; i < array.length;i++){
            if(array[i] < min) {
                min = array[i];
                j = i;
            }
        }
        return  j;
    }
}
