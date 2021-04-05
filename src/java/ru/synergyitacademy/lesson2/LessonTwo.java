package ru.synergyitacademy.lesson2;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        System.out.println("Расчет площади трапеции");
        System.out.println("Введите значение длины вершины:");
        Scanner num =  new Scanner(System.in);
        x = num.nextInt();
        System.out.println("Введите значение длины основания:");
        y = num.nextInt();
        System.out.println("Введите значение высоты:");
        z = num.nextInt();
        double squad = 0.5 * z * (x + y);
        System.out.println("Площадь трапеции равна " + squad + " метров квадратных");
    }
}
