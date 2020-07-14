package com.gmail.mykyta.smirnov.Arrays.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int[] reverse = reverse(array);
        for(int i = 0; i < reverse.length; i++){
            if(i == 0){
                System.out.print("Полученый массив в обратном порядке - ");
            }
            System.out.print(reverse[i] + " ");
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

    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for(int i = array.length - 1; i >= 0;i--){
            reverseArray[i] = array[array.length - i - 1];
        }
        return  reverseArray;
    }


}
