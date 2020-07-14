package com.gmail.mykyta.smirnov.Cycle.Task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число n.");
        int n = Integer.parseInt(bufferedReader.readLine());

        String s = String.valueOf(n);
        for(int i = s.length() - 1;i >=0; i--){
            System.out.print(s.charAt(i));
        }

    }
}
