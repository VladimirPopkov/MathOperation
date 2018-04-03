package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOne, numTwo;
        boolean flag = true;

        while (flag) {
            System.out.println("Введите 2 целых числа: ");
            try {
                numOne = scanner.nextInt();
                numTwo = scanner.nextInt();

                System.out.println("Сложение: " + (numOne + numTwo));
                System.out.println("Вычитание: " + (numOne - numTwo));
                if (numTwo != 0) {
                    System.out.println("Деление: " + ((float) numOne / numTwo));
                } else {
                    System.out.println("Деление: На ноль делить нельзя!");
                }
                System.out.println("Умножение: " + (numOne * numTwo));
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверное значение!");
                scanner.next();
            }
        }
    }
}
