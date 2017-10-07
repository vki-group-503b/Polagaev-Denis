package ru.hci.nsu.polagaev.javalabs.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array arr =new Array();
        System.out.print("Введите кол-во чисел в массиве: ");
        int[] array;
        if (scan.hasNextInt()) {
            array = new int[scan.nextInt()];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите число: " + (i + 1));
                if (scan.hasNextInt()) {
                    array[i] = scan.nextInt();
                } else {
                    System.out.println("Вы ввели не число!");
                    return;
                }
            }
            Arrays.sort(array);
        } else {
            System.out.println("Вы ввели не число!");
            return;
        }
        arr.min(array);
        arr.max(array);
        arr.avg(array);
        arr.median(array);
        arr.geometric(array);
    }
}
