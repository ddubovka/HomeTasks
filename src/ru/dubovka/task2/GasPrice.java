package ru.dubovka.task2;

import java.util.Scanner;

public class GasPrice {

    public static void main(String[] args) {
        Scanner litre = new Scanner(System.in);
        System.out.print("Введите количество литров бензина");
        int number = litre.nextInt();
        System.out.println("Вы ввели" + " " + number);
        int price = 49;
        System.out.println("Стоимость равна" + " " + number * price + "р.");

    }
}
