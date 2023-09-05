package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {

        // Input
        Calculator calculator = new Calculator(); // instantiation
        int input1 = 1;
        int input2 = 2;

        // Expected output
        int expectedOutput = 3;

        // Store result from test
        int actualOutput = calculator.add(input1, input2);

        // Check answers match
        assertEquals(expectedOutput,actualOutput); //AssertionFailedError
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtract(5,3);
        int expectedResult = 2;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiply(2,3);
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testDivide() {
        Calculator cal = new Calculator();
        int actualOutput = cal.divide(10,5);
        int expectedOutput = 2;
        assertEquals(expectedOutput, actualOutput);
    }
}

// Assertions
// assertEquals - check if args are equal
// assertTrue - checks if arg is true
// assertFalse - checks if arg is false
// assertNull - checks if arg is null
// assertNotNull - checks if arg is.... not null
// assertThrows - checks if an argument throws a certain exception


