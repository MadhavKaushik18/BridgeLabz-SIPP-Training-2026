package core_java_practice.gcr_codebase.String_practices.level1;

import java.util.Scanner;

public class LowerCaseDemo {

    static String toLower(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                ch = (char)(ch + 32);

            result += ch;
        }

        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String user = toLower(text);
        String builtIn = text.toLowerCase();

        System.out.println(user);
        System.out.println(builtIn);
        System.out.println(compareStrings(user, builtIn));
    }
}