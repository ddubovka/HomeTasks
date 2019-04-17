package ru.dubovka.task3;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please insert any two numbers:");
        double firstNumber = numbers.nextDouble();
        double secondNumber = numbers.nextDouble();
        if (firstNumber < secondNumber) {
            System.out.println("The less number is " + firstNumber);
        } else if (secondNumber < firstNumber) {
            System.out.println("The less number is " + secondNumber);
        } else {
            System.out.println("Numbers are equal");
        }

    }
}

