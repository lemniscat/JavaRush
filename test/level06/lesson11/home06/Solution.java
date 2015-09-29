package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss bender = new KissMyShinyMetalAss("robot");
        System.out.println(bender.toString());
    }

    public static class KissMyShinyMetalAss
    {
        String name = null;

        public KissMyShinyMetalAss(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }

    }

}
