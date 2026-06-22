package core_java_practice.gcr_codebase.Method_practice;

public class Day5_Scenerio {
    public static void main(String[] args) {

        MathWizard wizard = new MathWizard();

        System.out.println("Prime Check (17): "
                + wizard.isPrime(17));

        System.out.println("Factorial(int) of 5: "
                + wizard.factorial(5));

        System.out.println("Factorial(double) of 5.0: "
                + wizard.factorial(5.0));

        wizard.fibonacci(10);

        System.out.println("GCD of 12 and 18: "
                + wizard.gcd(12, 18));

        System.out.println("LCM of 12 and 18: "
                + wizard.lcm(12, 18));

        System.out.println("2^5 = "
                + wizard.power(2, 5));

        wizard.showScope();
    }

}
class MathWizard {

    int instanceVariable = 100;

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    void fibonacci(int n) {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void showScope() {
        int localVariable = 50;

        System.out.println("Instance Variable = " + instanceVariable);
        System.out.println("Local Variable = " + localVariable);
    }
}

