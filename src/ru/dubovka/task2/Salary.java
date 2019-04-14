package ru.dubovka.task2;

import java.util.Scanner;

public class Salary {


    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Калькулятор зарплаты на руки. Введите Вашу зарплату в рублях");
        int number = salary.nextInt();
        System.out.println("Вы ввели" + " " + number + ". ");
        System.out.println("Налоговый вычет на территории РФ сотсавляет 13%. Жаль Вам это сообщать, но Ваша реальная зарплата будет:");
        System.out.println(number * 0.87);

    }
}
