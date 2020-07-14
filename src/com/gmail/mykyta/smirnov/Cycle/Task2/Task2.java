package com.gmail.mykyta.smirnov.Cycle.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число.");
        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 2; i < number; i++){
            if (number%i == 0){
                System.out.println("Число не является простым.");
                return;
            }
        }

        System.out.println("Число простое.");

    }
}
