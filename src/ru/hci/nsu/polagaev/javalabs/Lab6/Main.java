package ru.hci.nsu.polagaev.javalabs.Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите какие точки хотите ввести 2хмерное - 1, 3хмерное - 2");
            String s = scanner.next();
            if (s.equals("1")) {
                Point2d();
            } else if (s.equals("2")) {
                //3хмерной нет пока
            } else{
                break;
            }
        }
    }

    private static void Point2d() {
        Point a = new Point();
        System.out.println("Введите координаты 1 точки: ");
        a.inputPoint();
        System.out.println("Введите координаты 2 точки: ");
        Point b = new Point(0, 0);
        b.inputPoint();
        if (a.isSame(b)) {
            System.out.println("Точки совпадают!");
        } else {
            System.out.println("Расстояние между точками: " + b.getDistance(a));
        }
        a.outputPoint();
        b.outputPoint();
        System.out.println("\n");
    }
}
