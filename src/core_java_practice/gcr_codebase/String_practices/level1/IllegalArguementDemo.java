package core_java_practice.gcr_codebase.String_practices.level1;

import java.util.Scanner;

public class IllegalArguementDemo {

    static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }

    static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // generateException(str);
        handleException(str);
    }
}