package com.gmail.mykyta.smirnov.ConditionalStatements.Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        double a = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Введите второе число");
        double b = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Введите третье число");
        double c = Double.parseDouble(bufferedReader.readLine());

      double d = a * b * c;
      double g = a + b + c;
      double m = Math.max(d, g);

        System.out.println(m + 3);


    }
}
