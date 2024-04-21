package org.example;

/**
 * The Calculator class provides basic arithmetic operations such as addition, subtraction, multiplication, and division.
 * @author Julián Liberatore
 * @version 1.0.0
 * @since 1.0.0
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b){
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a The integer to be subtracted from.
     * @param b The integer to subtract.
     * @return The result of subtracting b from a.
     */
    public int subtract(int a, int b){
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    public int multiply(int a, int b){
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of dividing a by b.
     * @throws ArithmeticException if the divisor is zero.
     */
    public int divide(int a, int b){
        if(b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}