package com.gmail.mykyta.smirnov.Function.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static final String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    public static final String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    public static final String[] HUNDREDS = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    public static final String[] THOUSANDS = {"тысяч","миллион","миллионов","миллиард", "миллиардов"};

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(bufferedReader.readLine());
        if (number < 1000000000) {
            int numberInt = (int) number;

            if (numberInt < 20)
                System.out.println(BELOW_TWENTY[numberInt]);
            else if (numberInt < 100) {
                int high = numberInt / 10;
                int low = numberInt % 10;
                String text = TENS[high];
                if (low != 0)
                    text = text + " " + BELOW_TWENTY[low];
                System.out.println(text);
            }

            if (numberInt > 100 && numberInt < 1000) {
                int high = numberInt / 100;
                int mid = (numberInt - high * 100) / 10;
                int low = numberInt % 10;
                String text = HUNDREDS[high];
                if (low != 0)
                    text = text + " " + TENS[mid] + " " + BELOW_TWENTY[low];
                System.out.println(text);
            } else if (numberInt == 100) {
                System.out.println(TENS[0]);
            }

            if (numberInt > 999 && numberInt < 1000000) {
                int thousands = numberInt / 1000;
                int highThousands = thousands / 100;
                int midThousands = (thousands - highThousands * 100) / 10;
                int lowThousands = thousands % 10;
                String textThousands = HUNDREDS[highThousands];
                int hunderds = numberInt - (thousands * 1000);
                int high = hunderds / 100;
                int mid = (hunderds - high * 100) / 10;
                int low = hunderds % 10;
                String text = HUNDREDS[high];
                if (low != 0)
                    text = textThousands + " " + TENS[midThousands] + " " + BELOW_TWENTY[lowThousands] + " " + THOUSANDS[0] + " " + text + " " + TENS[mid] + " " + BELOW_TWENTY[low];
                System.out.println(text);
            }

            if (numberInt > 1000000 && numberInt < 1000000000) {
                int millions = numberInt / 1000000;
                int highMillions = millions / 100;
                int midMillions = (millions - highMillions * 100) / 10;
                int lowMillions = millions % 10;
                String textMillions = HUNDREDS[highMillions];
                int thousands = (numberInt - (millions * 1000000)) / 1000;
                int highThousands = thousands / 100;
                int midThousands = (thousands - highThousands * 100) / 10;
                int lowThousands = thousands % 10;
                String textThousands = HUNDREDS[highThousands];
                int hunderds = numberInt - ((thousands * 1000) + (millions * 1000000));
                int high = hunderds / 100;
                int mid = (hunderds - high * 100) / 10;
                int low = hunderds % 10;
                String text = HUNDREDS[high];
                if (low != 0)
                    text = textMillions + " " + TENS[midMillions] + " " + BELOW_TWENTY[lowMillions] + " " + THOUSANDS[2] + " " + textThousands + " " + TENS[midThousands] + " " + BELOW_TWENTY[lowThousands] + " " + THOUSANDS[0] + " " + text + " " + TENS[mid] + " " + BELOW_TWENTY[low];
                System.out.println(text);
            } else if (number == 1000000) {
                System.out.println(THOUSANDS[1]);
            }
        }

            if (number > 1000000000 ){
                int billions = (int) (number/1000000000);
                int highBillions = billions / 100;
                int midBillions = (billions - highBillions*100) /10;
                int lowBillions = billions % 10;
                String textBillions = HUNDREDS[highBillions];
                int millions = (int) (number - billions * 1000000000)/ 1000000;
                int highMillions = millions / 100;
                int midMillions = (millions - highMillions*100) /10;
                int lowMillions = millions % 10;
                String textMillions = HUNDREDS[highMillions];
                int thousands = (int)(number - (((long)billions) * 1000000000 + millions * 1000000)) / 1000;
                int highThousands = thousands / 100;
                int midThousands = (thousands - highThousands*100) /10;
                int lowThousands = thousands % 10;
                String textThousands = HUNDREDS[highThousands];
                int hunderds = (int)number - ((billions * 1000000000) + (thousands * 1000) + (millions * 1000000));
                int high = hunderds / 100;
                int mid = (hunderds - high*100) /10;
                int low = hunderds % 10;
                String text = HUNDREDS[high];
                if (low != 0)
                    text =  textBillions + " " + TENS[midBillions] + " " + BELOW_TWENTY[lowBillions] + " " + THOUSANDS[4] + " " + textMillions + " " + TENS[midMillions] + " " + BELOW_TWENTY[lowMillions] + " " + THOUSANDS[2] + " " + textThousands + " " + TENS[midThousands] + " " + BELOW_TWENTY[lowThousands] + " " + THOUSANDS[0] + " " + text + " " + TENS[mid] + " " + BELOW_TWENTY[low];
                System.out.println(text);
            } else if (number == 1000000000){
                System.out.println(THOUSANDS[3]);
            }
    }

}
