package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Word";
        String s1 = "wordierword";
        if (s1.startsWith("word")) {
            System.out.println(s.toLowerCase());
        } else if (s1.endsWith("word")) {
            System.out.println(s.toUpperCase());
        }


    }
}
