package ru.hci.nsu.polagaev.javalabs.Lab1;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scan.nextInt();
        boolean perem = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                perem = false;
                break;
            }
        }
        if (perem) {
            System.out.println(num + "- Число простое");
        } else
            System.out.println(num + "- Число составное");
    }
}

