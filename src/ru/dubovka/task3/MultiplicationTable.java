package ru.dubovka.task3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        System.out.println("Insert number from 1 to 9:");
        int integer = table.nextInt();
        while (integer > 9 || integer < 1) {
            System.out.println("Try another number");
            System.out.println("Insert number from 1 to 9:");
            integer = table.nextInt();
            if (integer < 10 && integer > 1) {
                break;
            }
        }
        System.out.println("Multiplication table:");
        for (int i = 1; i < 10; i++) {
            System.out.println(integer + " * " + i + " = " + integer * i);
        }
    }
}