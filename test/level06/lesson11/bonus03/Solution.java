package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int mass[];
        mass = new int[5];
        int temp = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int n = 0; n < 5; n++) //принимаем данные
            mass[n] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 5; i++) //быстрая сортировка по возрастающей
            for (int j = i; j > 0 && mass[j - 1] > mass[j]; j--) // пока j>0 и элемент j-1 > j, x-массив int
            {
                temp = mass[j];
                mass[j] = mass[j - 1];
                mass[j - 1] = temp;
            }
        for (int n = 0; n < 5; n++)
            System.out.println(mass[n]);


    }
}
