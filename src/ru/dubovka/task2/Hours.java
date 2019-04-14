package ru.dubovka.task2;

import java.util.Scanner;

public class Hours {


    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        System.out.print("Перевод секунд в часы. Введите количество секунд");
        int number = sec.nextInt();
        System.out.println("Вы ввели" + " " + number);
        System.out.println("Количество часов равно " + number / 3600);
    }
}
