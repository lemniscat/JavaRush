package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int temp = 0;
        int[] mass;
        mass = new int[3];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        mass[0] = Integer.parseInt(read.readLine());
        mass[1] = Integer.parseInt(read.readLine());
        mass[2] = Integer.parseInt(read.readLine());
        for (int i = 0; i < 3; i++)
            for (int j = i; j > 0 && mass[j - 1] > mass[j]; j--) // пока j>0 и элемент j-1 > j, x-массив int
            {
                temp = mass[j];
                mass[j] = mass[j - 1];
                mass[j - 1] = temp;
            }
        System.out.println(mass[1]);
    }
}
