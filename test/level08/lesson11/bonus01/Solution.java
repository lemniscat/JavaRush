package com.javarush.test.level08.lesson11.bonus01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Map<String, Integer> mymap = new HashMap<String, Integer>();
        mymap.put("January", 1);
        mymap.put("February", 2);
        mymap.put("March", 3);
        mymap.put("April", 4);
        mymap.put("June", 6);
        mymap.put("July", 7);
        mymap.put("August", 8);
        mymap.put("September ", 9);
        mymap.put("October", 10);
        mymap.put("November", 11);
        mymap.put("December ", 12);
        mymap.put("May", 5);
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text + " is " + mymap.get(text) + " month");
    }





}
