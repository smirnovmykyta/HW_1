package com.gmail.mykyta.smirnov.ConditionalStatements.Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число а");
        int a = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите число б");
        int b = Integer.parseInt(bufferedReader.readLine());

        if( a%2==0)
            System.out.println("a*б = " + (a*b));
        else
            System.out.println("a+б = " + (a+b));


    }
}
