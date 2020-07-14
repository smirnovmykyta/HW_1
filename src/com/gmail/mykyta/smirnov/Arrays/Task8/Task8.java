package com.gmail.mykyta.smirnov.Arrays.Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int[] arrayTwo = change(array);
        for(int i = 0; i < arrayTwo.length; i++){
            if(i == 0){
                System.out.print("Измененный массив - ");
            }
            System.out.print(arrayTwo[i] + " ");
        }

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

    public static int[] change(int[] array) {
        int[] a = new int[array.length];
        if (array.length%2 == 0) {
            for (int i = 0; i < array.length; i++) {
                if (i <= array.length / 2 - 1)
                    a[i] = array[(array.length / 2) + i];

                if (i >= array.length / 2)
                    a[i] = array[i - (array.length/2)];
            }
        }

        if (array.length%2 != 0){
            for (int i = 0; i < array.length; i++) {
                if (i <= array.length / 2)
                    a[i] = array[(array.length / 2) + i];

                if (i >= array.length / 2 + 1)
                    a[i] = array[i - (array.length/2) - 1 ];
            }
        }
        return  a;
    }
}
