package ru.dubovka.task3;



public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table:");
        for (int i = 1; i < 10; ++i) {
            for (int c = 1; c < 11; ++c) {
                System.out.print(c * i + " ");
            }
            System.out.println();
        }
    }
}