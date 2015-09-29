package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        int array[];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = min(array);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int mass[])
    {
        Arrays.sort(mass);
        return mass[0];
    }

}
