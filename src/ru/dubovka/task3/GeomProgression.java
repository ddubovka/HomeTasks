package ru.dubovka.task3;

import java.util.Scanner;

public class GeomProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число во сколько раз будем увеличиваться геометрическая прогрессия:");
        int add = scanner.nextInt();
        System.out.println("Введите число -- количество элементов в прогрессии:");
        int seq = scanner.nextInt();

        int result = 1;
        int i;
        for (i = 0; i < seq; i++) {
            result *= add;
            System.out.println(result);
        }

      /*  int result = 1;
        i = 0;
        while (i < seq) {
            result *= add;
            System.out.println(result);
            i++;*/


    }
}
