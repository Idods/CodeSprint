package MergeSort;

import java.util.Arrays;

/**
 * Created by sancho on 02.11.14.
 */
public class MergeSort {

    public static <E extends Comparable> void sort(E[] mas, int left, int right) {
        if (right == left)
            return;

        sort(mas, left, (right + left) / 2);
        sort(mas, (right + left) / 2 + 1, right);

        int currFirstMas = left;
        int currSecondMas = (right + left) / 2 + 1;

        E[] merged = (E[]) new Comparable[right - left + 1];

        int currIndex = 0;

        while (currFirstMas <= (right + left) / 2 && currSecondMas <= right) {
            merged[currIndex] = mas[currFirstMas].compareTo(mas[currSecondMas]) < 0
                    ? mas[currFirstMas++] : mas[currSecondMas++];
            currIndex++;
        }

        while (currIndex < merged.length)
            if (currFirstMas <= (right + left) / 2)
                merged[currIndex++] = mas[currFirstMas++];
            else
                merged[currIndex++] = mas[currSecondMas++];


        for (int i = 0; i < merged.length; i++)
            mas[left + i] = merged[i];

    }

    public static <E extends Comparable> void sort(E[] mas) {
        sort(mas, 0, mas.length - 1);
    }

    public static void main(String[] args) {
        Integer[] mas = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};

        sort(mas);

        System.out.println(Arrays.toString(mas));
    }
}
