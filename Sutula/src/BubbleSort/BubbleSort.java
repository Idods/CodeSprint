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
                    E tmp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = tmp;
                    isChanged = true;
                }

            }
        } while (isChanged);
    }

    public static void main(String[] args) {
        Integer[] mas = {1, 3, 2, 5, 4, 9, 7, 8, 3, 3};

        sort(mas);

        System.out.println(Arrays.toString(mas));
    }
}
