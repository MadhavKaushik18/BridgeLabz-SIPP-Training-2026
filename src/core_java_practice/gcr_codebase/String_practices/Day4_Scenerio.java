package core_java_practice.gcr_codebase.String_practices;
import java.util.Scanner;
import java.util.Arrays;
public class Day4_Scenerio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String message = sc.nextLine().toLowerCase();

        String reverse = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverse += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reverse);

        if (message.equals(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        System.out.print("Enter first intercept: ");
        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second intercept: ");
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram: Yes");
        } else {
            System.out.println("Anagram: No");
        }

        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        char firstNonRepeating = '\0';

        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}
