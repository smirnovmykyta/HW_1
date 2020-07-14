package com.gmail.mykyta.smirnov.Function.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task2 {
    public static final String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    public static final String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    public static final String[] THOUSANDS = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());


        if (number < 20)
            System.out.println(BELOW_TWENTY[number]);
        else if (number < 100) {
            int high = number / 10;
            int low = number % 10;
            String text = TENS[high];
            if (low != 0)
                text = text + " " + BELOW_TWENTY[low];
            System.out.println(text);
        }
        if (number > 100 && number < 1000) {
            int high = number / 100;
            int mid = (number - high*100) /10;
            int low = number % 10;
            String text = THOUSANDS[high];
            if (low != 0)
                text = text + " " + TENS[mid] + " " + BELOW_TWENTY[low];
            System.out.println(text);
        } else if (number == 100) {
            System.out.println(TENS[0]);
        }
    }

}

