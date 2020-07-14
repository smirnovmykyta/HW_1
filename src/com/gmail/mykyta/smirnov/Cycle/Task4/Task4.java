package com.gmail.mykyta.smirnov.Cycle.Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число n.");
        int number = Integer.parseInt(bufferedReader.readLine());

        long fact = 1;

        for (int i = 1; i <= number; i++){
        fact = fact * i;
        }

        System.out.println("Факториал числа n = " + fact);
    }

}
