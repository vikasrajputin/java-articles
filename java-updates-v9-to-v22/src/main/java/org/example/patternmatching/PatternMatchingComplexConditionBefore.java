package org.example.patternmatching;

public class PatternMatchingComplexConditionBefore {
    public static void main(String[] args) {
        Object obj = 42;

        if (obj instanceof Integer) {
            Integer number = (Integer) obj;
            if (number > 10) {
                System.out.println("It's a large number: " + number);
            }
        } else {
            System.out.println("Not an integer");
        }
    }
}
