package ru.dubovka.task3;

import java.util.Scanner;

public class Description {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please insert any integer:");
        int insertNumber = number.nextInt();
        if (insertNumber > 0 & insertNumber % 2 == 0) {
            System.out.println("Your number is odd and positive");
        } else if (insertNumber > 0 & insertNumber % 2 == 1) {
            System.out.println("Your number is even and positive");
        } else if (insertNumber < 0 & insertNumber % 2 == 0) {
            System.out.println("Your number is odd and negative");
        } else if (insertNumber < 0 & insertNumber % 2 == -1) {
            System.out.println("Your number is even and negative");
        } else {
            System.out.println("Your number is zero");
        }
    }


}
