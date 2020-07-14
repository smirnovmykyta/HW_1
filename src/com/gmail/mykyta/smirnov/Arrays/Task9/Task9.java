package com.gmail.mykyta.smirnov.Arrays.Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        System.out.println("Сортировка пузырьком - " + Arrays.toString(bubble(array)));
        System.out.println("Сортировка выбором - " + Arrays.toString(select(array)));
        System.out.println("Сортировка вставками - " + Arrays.toString(insert(array)));

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

    public static int[] bubble(int[] array){
        boolean sort = false;
        while(!sort){
            sort = true;
            for (int i = 1; i < array.length; i++){
                if (array[i] < array[i - 1]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sort = false;
                }
            }
        }
        return array;
    }

    public static int[] select(int[] array){
       for (int i = 0; i < array.length; i++){
           int ind = min(array, i);
           int temp = array[i];
           array[i] = array[ind];
           array[ind] = temp;
       }
        return array;
    }

    public static int[] insert(int[] array){
        int j;
        int temp;
        for (int i = 0; i < array.length; i++){
            temp = array[i];
            for (j = i - 1; j>=0 && array[j] > temp; j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static int min(int[] array, int ind) {
        int min = array[ind];
        int minInd = ind;
        for(int i = ind + 1; i < array.length;i++){
            if(array[i] < min) {
                min = array[i];
                minInd = i;
            }
        }
        return  minInd;
    }

}
