/**
 * Holds a Computation which is to be compounded
 */

public class Computation {
    int initialValue;
    int currentValue;
    int iterations;

    /**
     * Constructor for an instance of Computation
     * @param initialValue is the initial value of the computation to be compounded.
     */
    public Computation(int initialValue) {
        this.initialValue = initialValue;
        this.currentValue = initialValue;

    }
}
