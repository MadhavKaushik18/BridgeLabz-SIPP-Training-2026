package core_java_practice.gcr_codebase.Arrays_practices.level1;

import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index++] = num;
        }

        System.out.println("Numbers:");

        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal = " + total);
    }
}