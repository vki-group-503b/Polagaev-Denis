package ru.hci.nsu.polagaev.javalabs.Lab6;

import java.util.Scanner;

public class Point {
    public double x;
    public double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void inputPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите обсцису: ");
        x = sc.nextDouble();
        System.out.println("Введите оринату: ");
        y = sc.nextDouble();
    }

    public void outputPoint() {
        System.out.println("(" + getX() + "," + getY() + ")");
    }

    boolean isSame(Point a) {
        if (x == a.x && y == a.y) {
            return true;
        } else {
            return false;
        }
    }

    public double getDistance(Point a) {
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }

}
