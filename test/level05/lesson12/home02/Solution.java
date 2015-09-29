package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man sasha = new Man("sasha", 19, "Omsk");
        Man misha = new Man("misha", 23, "Perm");
        Woman dasha = new Woman("Dasha", 13, "Perm");
        Woman gala = new Woman("gala", 30, "MSK");

        System.out.println(sasha.name + " " + sasha.age + " " + sasha.address);
        System.out.println(misha.name + " " + misha.age + " " + misha.address);
        System.out.println(dasha.name + " " + dasha.age + " " + dasha.address);
        System.out.println(gala.name + " " + gala.age + " " + gala.address);
    }

    public static class Man
    {
        String name = null;
        int age = 0;
        String address = null;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman
    {
        String name = null;
        int age = 0;
        String address = null;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
}
