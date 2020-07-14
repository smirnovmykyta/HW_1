package com.gmail.mykyta.smirnov.ConditionalStatements.Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        double a = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Введите второе число");
        double b = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Введите третье число");
        double c = Double.parseDouble(bufferedReader.readLine());

        double sum = 0;

        if (a > 0)
            sum += a;

        if (b > 0)
            sum += b;

        if (c > 0)
            sum +=c;


        System.out.println("Сумма положительных чисел = " + sum);


    }
}
