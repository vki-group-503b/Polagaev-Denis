package ru.hci.nsu.polagaev.javalabs.Lab1;

import java.util.Scanner;

public class BracketSequense {
    public static void main(String[] args) {
        System.out.println("Введите скобочную последовательность : ");
        BracketSequense.Scan();
    }

    public static void Scan() {
        Scanner f = new Scanner(System.in);
        String s = f.next();
        if (check(s)) System.out.println("Правильная скобочная последовательность ");
        else System.out.println("Неправильная скобочная последовательность ");
    }

    public static boolean check(String s) {
        int a[] = new int[s.length()];
        int scobki = 0;
        if (s.charAt(0) == ')') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a[scobki] = 1;
                scobki++;
            }
            if (s.charAt(i) == ')') {
                if (scobki == 0 || a[scobki - 1] == 0) {
                    return false;
                } else {
                    scobki--;
                }
            }
        }
        if (scobki != 0) {
            return false;
        } else return true;
    }
}

