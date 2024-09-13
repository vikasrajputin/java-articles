package org.example.patternmatching;

public class PatternMatchingWithSwitch {
    public static void main(String[] args) {
        switchWithComplexPatternMatching();
        switchWithNull();
    }

    private static void switchWithComplexPatternMatching() {
        Object obj = "Hello World!";  // Change this to Integer, Boolean, etc. to see different outputs.

        // Using switch with pattern matching to handle different types
        String result = switch (obj) {
            case String str -> "This is a String: " + str.toUpperCase();
            case Integer i -> "This is an Integer, squared: " + (i * i);
            case Boolean b -> "This is a Boolean, negated: " + !b;
            default -> "Unknown type";
        };

        System.out.println(result);
    }

    private static void switchWithNull() {
        Object obj = null;  // Could be String, Integer, Boolean, or even null.

        String result = switch (obj) {
            case null -> "Object is null";
            case String str -> "This is a String: " + str.toUpperCase();
            case Integer i -> "This is an Integer, doubled: " + (i * 2);
            case Boolean b -> "This is a Boolean, flipped: " + !b;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
