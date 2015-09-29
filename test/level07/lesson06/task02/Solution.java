package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> omg = new ArrayList<String>();
        omg.add("101");
        omg.add("102");
        omg.add("103");
        omg.add("104");
        omg.add("105");

        omg.remove(0);
        omg.remove(1);
        omg.remove(2);
        for (int i = 0; i < omg.size(); i++)
            System.out.println(omg.get(i));
        System.out.println(omg.size());

    }
}
