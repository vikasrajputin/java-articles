package org.example.patternmatching;

public class PatternMatchingMultiAfter {
    public static void main(String[] args) {
        Object obj = "Java 16 pattern matching";

        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        } else if (obj instanceof Integer number) {
            System.out.println("It's an integer: " + number);
        } else {
            System.out.println("Unknown type");
        }
    }
}
