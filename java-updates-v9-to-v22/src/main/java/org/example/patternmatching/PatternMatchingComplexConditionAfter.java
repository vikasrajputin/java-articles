package org.example.patternmatching;

public class PatternMatchingComplexConditionAfter {
    public static void main(String[] args) {
        Object obj = 42;

        if (obj instanceof Integer number && number > 10) {
            System.out.println("It's a large number: " + number);
        } else {
            System.out.println("Not an integer or not greater than 10");
        }
    }
}
