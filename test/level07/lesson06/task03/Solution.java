package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> omg = new ArrayList<String>();
        String temp = null;
        for (int i = 0; i < 5; i++)
            omg.add(reader.readLine());

        for (int i = 0; i < omg.size() / 2; i++) //массив в обратном порядке
        {
            temp = omg.get(i);
            omg.set(i, omg.get(5 - i - 1));
            omg.set(5 - i - 1, temp);
        }
        for (int i = 0; i < (5); i++)
            System.out.println(omg.get(i));


    }
}
