package org.example.unnamedvariable;

public class UnNamedVariableDemo {

    public static void main(String[] args) {

        Car _ = new Car();

//        _.drive();

        try{
            int counter = Integer.parseInt("abc");
        }catch (Exception _){
            System.out.println("This is not a number");
        }

    }
}


class Car {
    public void drive(){

    }
}