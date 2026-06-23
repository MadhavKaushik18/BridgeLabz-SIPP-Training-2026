package core_java_practice.scenerio_based;

public class Day1_scenerio {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 22;
        int rank = 5;
        double salary = 50000;
        float membershipFee = 999.99f;

        double bonus = salary * 0.12;
        int annualBonus = (int) bonus;

        System.out.println("=================================");
        System.out.println("      CODING GUILD WELCOME       ");
        System.out.println("=================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
        System.out.println("=================================");
        System.out.println("Welcome to the Coding Guild!");
        System.out.println("=================================");
    }
}
