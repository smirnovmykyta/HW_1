package com.gmail.mykyta.smirnov.Arrays.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int sum = sum(array);
        System.out.println("Сумма элементов массива с нечетным индексом = " + sum);
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

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length;i++){
            if(i%2 != 0)
                sum += array[i];

        }
        return  sum;
    }
}
