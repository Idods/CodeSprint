package InsertionSort;

import java.util.Arrays;

/**
 * Created by sancho on 02.11.14.
 */
public class InsertionSort {

    private static <E extends Comparable> void sort(E[] mas) {
        for (int i = 1; i < mas.length; i++) {
            E curr = mas[i];
            int prev = i - 1;
            while (prev >= 0 && mas[prev].compareTo(curr) > 0) {
                mas[prev + 1] = mas[prev];
                mas[prev] = curr;
                prev--;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] mas = {1, 3, 2, 5, 4, 9, 7, 8, 3, 3};

        sort(mas);

        System.out.println(Arrays.toString(mas));
    }

}
