package com.gmail.mykyta.smirnov.Function.Task6;

import java.util.HashMap;

public class Task6 {
    static HashMap<String, Integer> numbers = new HashMap<String, Integer>();
    static HashMap<String, Integer> onumbers = new HashMap<String, Integer>();
    static HashMap<String, Integer> tnumbers = new HashMap<String, Integer>();
    static HashMap<String, Integer> trnumbers = new HashMap<String, Integer>();

    static {
        numbers.put("ноль", 0);
        numbers.put("один", 1);
        numbers.put("два", 2);
        numbers.put("три", 3);
        numbers.put("четыре", 4);
        numbers.put("пять", 5);
        numbers.put("шесть", 6);
        numbers.put("сем", 7);
        numbers.put("восемь", 8);
        numbers.put("девять", 9);
        numbers.put("десять", 10);
        numbers.put("одинадцать", 11);
        numbers.put("двенадцать", 12);
        numbers.put("тринадцать", 13);
        numbers.put("четырнадцать", 14);
        numbers.put("пятнадцать", 15);
        numbers.put("шестнадцать", 16);
        numbers.put("семнадцать", 17);
        numbers.put("восемнадцать", 18);
        numbers.put("девятьнадцать", 19);


        tnumbers.put("двадцать", 20);
        tnumbers.put("тридцать", 30);
        tnumbers.put("сорок", 40);
        tnumbers.put("пятьдесят", 50);
        tnumbers.put("шестьдесят", 60);
        tnumbers.put("семьдесят", 70);
        tnumbers.put("восемьдесят", 80);
        tnumbers.put("девяносто", 90);

        trnumbers.put("сто", 100);
        trnumbers.put("двести", 200);
        trnumbers.put("триста", 300);
        trnumbers.put("четыреста", 400);
        trnumbers.put("пятьсот", 500);
        trnumbers.put("шестьсот", 600);
        trnumbers.put("семьсот", 700);
        trnumbers.put("восемьсот", 800);
        trnumbers.put("девятьсот", 900);

        onumbers.put("тысяча", 1000);
        onumbers.put("тысяч", 1000);
        onumbers.put("миллион", 1000);
        onumbers.put("миллиона", 1000);
        onumbers.put("миллионов", 1000);
        onumbers.put("миллиард", 1000000);
        onumbers.put("миллиарда", 1000000);
        onumbers.put("миллиардов", 1000000);

        //numbers.put("", );
    }

    public static void main(String args[]) {
        String input1 = "девятьсот восемьдесят один";
        String input2 = "девяносто пять";
        String input3 = "один миллиард двести тысяча шестьсот двадцать шесть";
        String input4 = "два миллиона девятьсот восемьдесят один тысяча шестьсот двадцать шесть ";
        String input5 = "миллиард";

        wordToNumber(input1);
        wordToNumber(input2);
        wordToNumber(input3);
        wordToNumber(input4);
        wordToNumber(input5);


    }

    private static void wordToNumber(String input) {
        System.out.println("===========\nInput string = " + input);
        long sum = 0;
        String[] splitted = input.toLowerCase().split(" ");


        for (String split : splitted) {
            if (numbers.get(split) != null) {
                sum = sum + numbers.get(split);

            } else if (tnumbers.get(split) != null) {
                sum = sum + tnumbers.get(split);
            } else if (trnumbers.get(split) != null) {
                sum = sum + trnumbers.get(split);
            } else if (onumbers.get(split) != null) {
                if (sum == 0) {
                    if (split.equals("миллион") || split.equals("миллиона") || split.equals("миллионов") || split.equals("миллиард") || split.equals("миллиарда") || split.equals("миллиардов")) {
                        sum = sum + (onumbers.get(split) * 1000);
                    } else
                        sum = sum + onumbers.get(split);
                } else
                    sum = sum * onumbers.get(split);
            }
        }

        System.out.println(sum);
    }
}
