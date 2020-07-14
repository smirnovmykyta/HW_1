package com.gmail.mykyta.smirnov.Cycle.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число n.");
        String s = bufferedReader.readLine();
        String [] a = s.split("");
        int sum = 0;

        for (int i = 0; i < a.length; i++){
            sum += Integer.parseInt(a[i]);
        }

        System.out.println("Сумма цифр числа = " + sum);

    }
}
