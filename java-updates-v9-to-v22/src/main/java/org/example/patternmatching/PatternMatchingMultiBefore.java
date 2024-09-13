package org.example.patternmatching;

public class PatternMatchingMultiBefore {
    public static void main(String[] args) {
        Object obj = "Java 16 pattern matching";

        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        } else if (obj instanceof Integer) {
            Integer number = (Integer) obj;
            System.out.println("It's an integer: " + number);
        } else {
            System.out.println("Unknown type");
        }
    }
}
