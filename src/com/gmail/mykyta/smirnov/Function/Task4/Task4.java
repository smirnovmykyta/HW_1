package com.gmail.mykyta.smirnov.Function.Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите х1");
        double x1 = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите у1");
        double y1 = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите х2");
        double x2 = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите у2");
        double y2 = Double.parseDouble(bufferedReader.readLine());

        double distance = Math.sqrt(((y2 - y1)*(y2 - y1)) + ((x2 - x1)*(x2 - x1)));
        System.out.println("Растояние между точками = " + distance);



    }
}
