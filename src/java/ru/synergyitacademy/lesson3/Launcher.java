package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("ДЛя сложения нам потребуется два числа");
        System.out.println("Введите левое слогаемое");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите правое слогаемое");
        int b = scanner.nextInt();
        System.out.printf("Результат сложения двух чисел(%d b %d) равен %d", a, b, a + b);
    }
}
