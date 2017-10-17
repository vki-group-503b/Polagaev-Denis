package ru.hci.nsu.polagaev.javalabs.lab2;
import java.util.Scanner;
import java.util.Arrays;

class Array {
    int[] array;

     public Array() {
        Scanner in = new Scanner(System.in);
        array = new int[in.nextInt()];
        for (int i = 0; i< array.length; i++){
        System.out.println("i: "+(i+1)+": ");
        array[i]=in.nextInt();
        }
    }

    void min() {

        System.out.println("Минимальное число: " + array[0]);
    }

    void max() {
        System.out.println("Максимальное число: " + array[array.length - 1]);
    }

    void avg() {
        float avg = 0;
        for (float i : array) {
            avg = avg + i;
        }
        avg = avg / array.length;
        System.out.println("Среднее: " + avg);
    }

    void median() {
        Arrays.sort(array);
        float median;
        if (array.length % 2 == 0) {
            median = ((array[array.length / 2]) + array[array.length / 2 - 1]);
        } else {
            median = array[array.length / 2];
        }
        System.out.println("Медиана:" + median);
    }

    void geometric() {
        Arrays.sort(array);
        float geometric;
        float comp = 1;
        for (float i : array) {
            comp = comp * i;
        }
        geometric = (float) Math.exp(Math.log(comp) / array.length);
        System.out.println("Среднее геометрическое: " + geometric);
    }
}
