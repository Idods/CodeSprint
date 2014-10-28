package Euclid;

import java.util.Scanner;

/**
 * Created by sancho on 28.10.14.
 */
public class Euclid {

    //Тут більш наочно
    public static int findGCD(int a, int b) {
        if (a == b)
            return a;
        else if (a > b)
            return findGCD(a - b, b);
        else
            return findGCD(b - a, a);
    }


    //Другим способом реалізовано
    public static int findGCDS(int a, int b) {
        if (a == 0) return b;
        return a > b ? findGCDS(Math.abs(a - b), b) : findGCDS(Math.abs(a - b), a);
    }

    public static int findGCDIterable(int a, int b) {
        while (a != 0 && b != 0)
            if (a > b)
                a = a - b;
            else
                b = b - a;
        return b == 0 ? a : b;
    }

    //Для декількох елементів
    public static int findGCD(int a, Integer... args) {
        for (Integer b : args) {
            a = findGCDIterable(a, b);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for finding their GSD");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("First method: " + findGCD(a, b));
        System.out.println("Second method: " + findGCDS(a, b));
        System.out.println("Third method: " + findGCDIterable(a, b));

        System.out.println("For several elements: " + findGCD(252, 105, 21));
        sc.close();
    }
}
