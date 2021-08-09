package ua.intita.qa;

import java.sql.Array;

public class DivideByThreeAndNine {
    public static void divide (int[] arr, int n) {
        int[] div3 = new int[n];
        int[] div9 = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                div3[i] = arr[i];
            }
            if (arr[i] % 9 == 0) {
                div9[i] = arr[i];
            }
        }
        System.out.print("The numbers that are divisible by 3 : ");
        for (int i = 0; i < n; i++) {
            if (div3[i] != 0) {
                System.out.print(div3[i] + " ");
            }
        }
        System.out.print("\nThe numbers that are divisible by 9 : ");
        for (int i = 0; i < n; i++) {
            if (div9[i] != 0) {
                System.out.print(div9[i]+" ");
            }
        }
        System.out.print("\n");
    }
}