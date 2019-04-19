package ru.dubovka.task3;

import sun.security.util.Length;

import java.util.Scanner;

public class GeomProgression {
    public static void main(String[] args) {
        Scanner addNumber = new Scanner(System.in);
        Scanner seqNumber = new Scanner(System.in);
        System.out.println("Введите число во сколько раз будем увеличиваться геометрическая прогрессия:");
        int add = addNumber.nextInt();
        System.out.println("Введите число -- количество элементов в прогрессии:");
        int seq = seqNumber.nextInt();
        for (int i = 1; i == seq; ++i) {
            System.out.print(i + 5);
        }

    }
}
