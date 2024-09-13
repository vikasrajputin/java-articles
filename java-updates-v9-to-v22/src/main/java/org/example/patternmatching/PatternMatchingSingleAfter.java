package org.example.patternmatching;

public class PatternMatchingSingleAfter {
    public static void main(String[] args) {
        Object obj = "Hello, World!"; // It could be any object

        if (obj instanceof String str) {
            // No need to cast, we can directly use str as a String
            System.out.println("The string is: " + str.toUpperCase());
        } else {
            System.out.println("Not a string");
        }
    }
}
