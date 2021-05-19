package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("БВТ1902 Долматов Лев");
        System.out.println("9 по списку");
        System.out.println("Hello, world!");
        Scanner in = new Scanner(System.in);
        int maximum = 1000 + 9;
        int minimum = -250;
        System.out.println("Ввидите высоту массива: ");
        int y = in.nextInt();
        System.out.println("Ввидите длинну массива: ");
        int x = in.nextInt();
        if (x == 0) {
            x = 50;
        }
        if (y == 0) {
            y = 50;
        }
        int[][] arr = new int[y][x];
        arr = RandomMatrix.CreateRandomMatrix(arr, minimum, maximum);
        int arr1[][] = arr;
        int n = 1;
        while (n > -1 && n < 7) {
            System.out.println(" ");
           System.out.println("Выберите тип сортировки: ");
           System.out.println("1) Выбором");
           System.out.println("2) Вставкой");
           System.out.println("3) Обменом");
           System.out.println("4) Сортировка Шелла");
           System.out.println("5) Быстрая");
           System.out.println("6) Пирамидальная");
           System.out.println(" ");
           System.out.println("0) Закончить");
            n = in.nextInt();
            switch (n) {
                case (1):
                    Sort.one(arr, y, x);
                    arr = arr1;
                    break;
                case (2):
                    Sort.two(arr, y, x);
                    arr = arr1;
                    break;
                case (3):
                    Sort.three(arr, y, x);
                    arr = arr1;
                    break;
                case (4):
                    Sort.four(arr, y, x);
                    arr = arr1;
                    break;
                case (5):
                    Sort.five(arr, y, x);
                    arr = arr1;
                    break;
                case (6):
                    Sort.six(arr, y, x);
                    arr = arr1;
                    break;

            }
        }

            //int[] arr = new int [10];
            //System.out.println (arr);
        }
    }

