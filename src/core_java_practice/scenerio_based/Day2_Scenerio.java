package core_java_practice.scenerio_based;
import java.util.Scanner;

public class Day2_Scenerio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            incomes[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double tax;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                System.out.println("Citizen " + (i + 1) +
                        " -> Tax Bracket: 5%, Tax: " + tax);
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                System.out.println("Citizen " + (i + 1) +
                        " -> Tax Bracket: 15%, Tax: " + tax);
            } else {
                tax = incomes[i] * 0.30;
                System.out.println("Citizen " + (i + 1) +
                        " -> Tax Bracket: 30%, Tax: " + tax);
            }

            totalTax += tax;
        }

        System.out.println("Total Tax Collected: " + totalTax);
    }
}