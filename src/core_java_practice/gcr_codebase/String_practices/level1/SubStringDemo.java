package core_java_practice.gcr_codebase.String_practices.level1;

import java.util.Scanner;

public class SubStringDemo {

    static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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

        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSub = createSubstring(str, start, end);
        String builtInSub = str.substring(start, end);

        System.out.println(userSub);
        System.out.println(builtInSub);

        System.out.println(compareStrings(userSub, builtInSub));
    }
}
