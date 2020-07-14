package com.gmail.mykyta.smirnov.ConditionalStatements.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите координату x");
        int x = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите координату y");
        int y = Integer.parseInt(bufferedReader.readLine());

        if(x > 0 && y > 0)
            System.out.println("Точка принадлежит к первой четверти");
        else
            if(x < 0 && y > 0)
            System.out.println("Точка принадлежит к второй четверти");
            else
                if(x < 0 && y < 0)
                System.out.println("Точка принадлежит к третьей четверти");
                else
                    if(x > 0 && y < 0)
                    System.out.println("Точка принадлежит к четвёртой четверти");
                    else
                        System.out.println("Точка лежит на оси.");

    }
}
