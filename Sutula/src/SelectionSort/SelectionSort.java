package SelectionSort;

import java.util.Arrays;

/**
 * Created by sancho on 02.11.14.
 */
public class SelectionSort {
    public static <E extends Comparable> void sort(E[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[minIndex].compareTo(mas[j]) > 0) {
                    minIndex = j;
                }
            }
            E tmp = mas[i];
            mas[i] = mas[minIndex];
            mas[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        Integer[] mas = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43, 1, 12, 5, 26, 7, 14, 3, 7, 2};
        sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
