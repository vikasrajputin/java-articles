package org.example.patternmatching;

public class PatternMatchingSingleBefore {
    public static void main(String[] args) {
        Object obj = "Hello, World!"; // It could be any object

        if (obj instanceof String) {
            // Since obj is an instance of String, we need to cast it to use String methods
            String str = (String) obj; 
            System.out.println("The string is: " + str.toUpperCase());
        } else {
            System.out.println("Not a string");
        }
    }
}
