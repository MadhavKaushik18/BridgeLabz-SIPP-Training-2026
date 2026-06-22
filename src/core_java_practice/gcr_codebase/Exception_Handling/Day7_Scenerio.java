package core_java_practice.gcr_codebase.Exception_Handling;

import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Day7_Scenerio {

    public static void makePayment(double billAmount, double amountPaid)
            throws InsufficientFundsException {

        if (amountPaid < billAmount) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] patientBills = {5000, 7000, 3000};

        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Bill: ₹" + patientBills[index]);

            System.out.print("Enter number of items in bill: ");
            int items = Integer.parseInt(sc.nextLine());

            double averageCost = patientBills[index] / items;
            System.out.println("Average cost per item: ₹" + averageCost);

            System.out.print("Enter payment amount: ");
            double paid = Double.parseDouble(sc.nextLine());

            makePayment(patientBills[index], paid);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter numeric values only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index: Patient does not exist.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Billing operation completed.");
            sc.close();
        }
    }
}