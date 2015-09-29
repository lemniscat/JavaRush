package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum, N, k;
        maximum = -9999999;
        //System.out.println("what count of numbers?");
        if ((N = Integer.parseInt(reader.readLine())) > 0) //n>0
        {
            for (int i = 0; i < N; i++)
            {
                if ((k = Integer.parseInt(reader.readLine())) > maximum)
                    maximum = k;

            }
        }


        System.out.println(maximum);

    }
}
