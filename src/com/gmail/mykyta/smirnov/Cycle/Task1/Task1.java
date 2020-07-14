package com.gmail.mykyta.smirnov.Cycle.Task1;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        for (int  i = 1; i < 100; i++){
            if (i%2 == 0) {
                sum += i;
                number++;
            }
        }

        System.out.println("Сумма четных чисел = " + sum);
        System.out.println("Количесство четных чисел = " + number);

    }
}
