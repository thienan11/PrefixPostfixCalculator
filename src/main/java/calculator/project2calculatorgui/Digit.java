package calculator.project2calculatorgui;

/**
 * CSC 305 Project 2
 * Represents a single numeric value in an expression.
 *
 * @author Thien An Tran
 * @version 2.0
 */
public class Digit implements Expression{
    private final double value;

    /**
     * Constructs a Digit object
     *
     * @param value a double
     */
    public Digit(double value) {
        this.value = value;
    }

    /**
     * Returns the value of the Digit object
     *
     * @return a double
     */
    @Override
    public double evaluate() {
        return value;
    }

    /**
     * Returns a string representation of the Digit object
     *
     * @return a string
     */
    @Override
    public String toString() {
        return Double.toString(value);
    }

    /**
     * Returns a string representation of the Digit object
     *
     * @return a string
     */
    @Override
    public String toPrefixString() {
        return toString();
    }

    /**
     * Returns a string representation of the Digit object
     *
     * @return a string
     */
    @Override
    public String toPostfixString() {
        return toString();
    }
}
