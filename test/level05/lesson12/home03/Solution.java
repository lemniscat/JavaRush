package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat Tom = new Cat("Tom", 5, 100);
        Dog Gav = new Dog("Gav", 12, 70);

    }

    public static class Cat
    {
        String name;
        int mass;
        int speed;

        public Cat(String name, int mass, int speed)
        {
            this.name = name;
            this.speed = speed;
            this.mass = mass;

        }
    }

    public static class Dog
    {
        String name;
        int mass;
        int speed;

        public Dog(String name, int mass, int speed)
        {
            this.name = name;
            this.speed = speed;
            this.mass = mass;

        }
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //Напишите тут ваши классы

}
