package core_java_practice.gcr_codebase.Arrays_practices;
import java.util.HashSet;
import java.util.Scanner;

public class Day3_Scenerio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stock = {50, 20, 70, 40, 20, 90, 50};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] > max) {
                max = stock[i];
            }
            if (stock[i] < min) {
                min = stock[i];
            }
            total += stock[i];
        }

        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int item : stock) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Duplicate Quantities: " + duplicates);

        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();

        k = k % stock.length;

        int[] rotated = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            rotated[(i + k) % stock.length] = stock[i];
        }

        System.out.print("Rotated Stock Array: ");
        for (int item : rotated) {
            System.out.print(item + " ");
        }

        System.out.println();

        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Shelf Grid:");
        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[0].length; j++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transpose = new int[shelf[0].length][shelf.length];

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[0].length; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("Transposed Shelf Grid:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
