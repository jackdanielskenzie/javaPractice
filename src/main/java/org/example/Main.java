package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    // PURE FUNCTIONS
    // 1. Always return the same result, given the same input
    // 2. Doesn't change data that isn't defined in its scope
    public static void changeTheReference(int[] myArray) { // IMPURE method
        myArray[0] = 12345; // Side Effect
    }

    public static int[] dontMakeAChange(int[] oldArray) {
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[0] = 45678;
        return newArray;
    }

    public static int sum(int a, int b) {
        //incrementValue(); // MAY produce side effects; make sure it's a private method
        return a + b;
    }

    // Avoiding Side Effects
    // 1. Avoid global variables. Avoid changing variables NOT defined in the current scope
    // 2. Use the "final" keyword.
    final String[] users = {"Luke", "Jack", "Michael"};
    // 3. If you need to change something, create a new variable.
    // 4. Use good variable names! Don't use "a," "b" "temp." shoeStringLength. Good variable names are nouns.
}