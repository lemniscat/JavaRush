package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int k = 0;
        boolean exit = false;
        while (!exit)
        {
            k = Integer.parseInt(read.readLine());
            if (k == -1)
                exit = true;
            else
                sum = sum + k;
        }
        System.out.println(sum - 1);

    }
}
