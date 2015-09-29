package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = maximum(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException
    {
        int[] arr;
        arr = new int[4];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int maximum(int[] array)
    {
        int max;
        max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}






