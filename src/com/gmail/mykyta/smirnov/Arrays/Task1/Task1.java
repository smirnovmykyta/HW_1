package com.gmail.mykyta.smirnov.Arrays.Task1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int min = min(array);
        System.out.println("Минимальный элемент массива = " + min);
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
        for(int i = 1; i < array.length;i++){
            if(array[i] < min)
                min = array[i];
        }
        return  min;
    }
}
