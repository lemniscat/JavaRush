package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

@SuppressWarnings("ALL")
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mon = reader.readLine();
        mon.toUpperCase();

        Date date = new Date(mon + " 1 2000");

        System.out.println(mon + " is " + (date.getMonth() + 1) + " month");
    }

}
