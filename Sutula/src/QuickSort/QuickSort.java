package QuickSort;

import java.util.Arrays;

/**
 * Created by sancho on 01.11.14.
 */
public class QuickSort {
    private static <E extends Comparable> int partition(E[] mas, int left, int right) {
        E median = mas[(right + left) / 2];
        int l = left;
        int r = right;

        while (l <= r) {
            while (mas[l].compareTo(median) > 0)
                l++;
            while (mas[r].compareTo(median) < 0)
                r--;
            if (l <= r) {
                E tmp = mas[r];
                mas[r] = mas[l];
                mas[l] = tmp;
                l++;                //Без цих двох рядків ніфіга не працює
                r--;
            }
        }

        return l;
    }

    public static <E extends Comparable> void sort(E[] mas, int left, int right) {
        int i = partition(mas, left, right);
        if (left < i - 1)
            sort(mas, left, i - 1);
        if (i < right)
            sort(mas, i, right);
    }

    public static <E extends Comparable> void sort(E[] mas) {
        sort(mas, 0, mas.length - 1);
    }

    public static void main(String[] args) {
        Integer[] mas = {1, 12, 5, 26, 7, 14, 3, 7, 2};
        sort(mas);
        System.out.println(Arrays.toString(mas));

    }
}
