package ru.dubovka.task2;

import java.util.Scanner;

public class GasPrice {

    public static void main(String[] args) {
        Scanner litre = new Scanner(System.in);
        System.out.println("Введите количество литров бензина");
        int number = litre.nextInt();
        System.out.println("Вы ввели" + " " + number);
        int price = 49;
        int result = number * price;
        System.out.println("Стоимость равна" + " " + result + "р.");

    }
}
