package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        Date today = new Date();
        today.getTime();
        String a = null;
        String text = "";
        a = today.toLocaleString();
        //for (int i = 0;i<10;i++)
        text = text + a.toCharArray()[0];
        text = text + a.toCharArray()[1];
        text = text + " ";
        text = text + a.toCharArray()[3];
        text = text + a.toCharArray()[4];
        text = text + " ";
        text = text + a.toCharArray()[6];
        text = text + a.toCharArray()[7];
        text = text + a.toCharArray()[8];
        text = text + a.toCharArray()[9];
        System.out.println(text);
    }
}
