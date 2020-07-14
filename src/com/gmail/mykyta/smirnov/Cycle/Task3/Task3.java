package com.gmail.mykyta.smirnov.Cycle.Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число.");
        int number = Integer.parseInt(bufferedReader.readLine());

        int sqrtNum = (int)Math.round(Math.sqrt(number));

        System.out.println("Корень числа = " + sqrtNum);

    }
}
