package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine(); //дедушка
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine(); //бабушка
        Cat grandMother = new Cat(grandMotherName);

        String FatherName = reader.readLine();//батя
        Cat Father = new Cat(FatherName, grandFather, null);

        String motherName = reader.readLine();//маман
        Cat Mother = new Cat(motherName, null, grandMother);

        String sonName = reader.readLine();//сына
        Cat son = new Cat(sonName, Father, Mother);

        String daughterName = reader.readLine();//доча
        Cat Daughter = new Cat(daughterName, Father, Mother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(son);
        System.out.println(Daughter);
    }

    public static class Cat
    {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat papa)
        {
            this.name = name;
            this.papa = papa;
        }

        Cat(String name, Cat papa, Cat mama)
        {
            this.name = name;
            this.mama = mama;
            this.papa = papa;
        }

        @Override
        public String toString()
        {
            String text = "Cat name is " + name;
            if (mama == null)
                text = text + ", no mother ";
            else
                text = text + ", mother is " + mama.name;

            if (papa == null)
                text = text + ", no father";
            else
                text = text + ", father is " + papa.name;

            if (name == null)
                text = "Cat name is , no mother , no father";

            return text;

        }
    }

}
