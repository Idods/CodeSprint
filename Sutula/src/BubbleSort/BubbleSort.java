package BubbleSort;

import java.util.Arrays;

/**
 * Created by sancho on 28.10.14.
 */
public class BubbleSort {
    public static <E extends Comparable> void sort(E[] mas) {
        boolean isChanged;
        do {
            isChanged = false;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i].compareTo(mas[i - 1]) < 0) {
                    swap(mas, i, i - 1);
                    isChanged = true;
                }

            }
        } while (isChanged);
    }

    public static <E extends Comparable> void swap(E[] mas, int first, int second) {
        E tmp = mas[first];
        mas[first] = mas[second];
        mas[second] = tmp;
    }

    public static void main(String[] args) {
        Integer[] mas = {1, 3, 2, 5, 4, 9, 7, 8, 3, 3};

        sort(mas);

        System.out.println(Arrays.toString(mas));
    }
}
