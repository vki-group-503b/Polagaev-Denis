import java.util.Arrays;

class Array {
    void min(int a[]) {
        System.out.println("Минимальное число: " + a[0]);
    }

    void max(int a[]) {
        System.out.println("Максимальное число: " + a[a.length - 1]);
    }

    void avg(int a[]) {
        float avg = 0;
        for (int i : a) {
            avg = avg + i;
        }
        avg = avg / a.length;
        System.out.println("Среднее число: " + avg);
    }

    void median(int[] a) {
        Arrays.sort(a);
        float median;
        if (a.length % 2 == 0) {
            median = (float) ((a[a.length / 2]) + a[a.length / 2 - 1]);
        } else {
            median = a[a.length / 2];
        }
        System.out.println("Медиана:" + median);
    }

    void geometric(int[] a) {
        Arrays.sort(a);
        float geometric;
        int comp = 1;
        for (int i : a) {
            comp = comp * i;
        }
        geometric = (float) Math.exp(Math.log(comp) / a.length);
        System.out.println("Среднее геометрическое: " + geometric);
    }
}
