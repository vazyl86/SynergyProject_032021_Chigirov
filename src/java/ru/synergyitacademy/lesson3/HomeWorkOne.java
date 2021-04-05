package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        //Уравнение a * x * x + b * x + c = 0
        // a != 0
        // D = b * b - 4 * a * c
        double a;
        double b;
        double c;
        System.out.println("Найдем корни уравнения ax^2 + bx + c = 0");
        System.out.println("Введите значение a:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else {
            System.out.println("Введите значение b:");
            b = scanner.nextInt();
            System.out.println("Введите значение c:");
            c = scanner.nextInt();
            double diskrim = b * b - 4 * a * c;
            if (diskrim > 0) {
                double xOne = ((-b) + Math.sqrt(diskrim)) / (2 * a);
                double xTwo = ((-b) - Math.sqrt(diskrim)) / (2 * a);
                System.out.println(xOne + " " + xTwo);
            } else if (diskrim == 0) {
                double x = -(b / (2 * a));
                System.out.println(x);

            } else {
                System.out.println("Нет действительных решений уравнения!");
            }
        }
    }
}
