package com.gmail.mykyta.smirnov.ConditionalStatements.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите рейтинг студента");
        int a = Integer.parseInt(bufferedReader.readLine());

        if (a >= 0 && a < 20)
            System.out.println("Оценка студента F");

        if (a >= 20 && a < 40)
            System.out.println("Оценка студента E");

        if (a >= 40 && a < 60)
            System.out.println("Оценка студента D");

        if (a >= 60 && a < 75)
            System.out.println("Оценка студента C");

        if (a >= 75 && a < 90)
            System.out.println("Оценка студента B");

        if (a >= 90 && a <= 100)
            System.out.println("Оценка студента A");

        if (a < 0 || a > 100)
            System.out.println("Рейтинг введён некорректно.");


    }
}
