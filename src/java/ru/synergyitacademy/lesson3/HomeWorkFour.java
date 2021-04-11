package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        // a+b=c   b+c=d
        float a = 0;
        float b = 1;
        float c = 1;
        float fibonachchi=c;
        System.out.println("Введите N-Число последовательности Чисел Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextInt();
        for ( int i = 1; i <= number; i++){
            fibonachchi = c;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(fibonachchi);
    }
}
