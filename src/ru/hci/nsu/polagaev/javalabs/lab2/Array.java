package ru.hci.nsu.polagaev.javalabs.lab2;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов в массиве ");
        int nums[] = scanner();
        System.out.println("Минимальный элемент : " + min(nums));
        System.out.println("Максимальный элемент : " + max(nums));
        System.out.println("Среднее значение " + midle(nums));
        System.out.println("Медиана массива " + median(nums));
        System.out.println("Среднее геометрическое " + geometric(nums));
    }

    private static int[] scanner() {
        Scanner in = new Scanner(System.in);
        int kol = in.nextInt();
        int nums[] = new int[kol];
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Nums : " + i);
            nums[i] = in.nextInt();
        }
        return nums;
    }

    private static int min(int nums[]) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] < min) min = nums[i];
        return min;
    }

    private static int max(int nums[]) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++)
            if (max < nums[i]) max = nums[i];
        return max;
    }

    private static float midle(int nums[]) {
        float result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result / nums.length;
    }

    private static float median(int nums[]) {
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return ((nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2);
        } else return nums[nums.length / 2];
    }

    private static double geometric(int nums[]) {
        double result = 1;
        for (int i = 0; i < nums.length; i++) {
            result *= nums[i];
        }
        return Math.exp(Math.log(result) / nums.length);
    }
}
