package ru.dubovka.task2;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        System.out.println("Перевод секунд в часы. Введите количество секунд");
        int number = sec.nextInt();
        System.out.println("Вы ввели" + " " + number);
        int result = number / 3600;
        System.out.println("Количество часов равно " + result);
    }
}
