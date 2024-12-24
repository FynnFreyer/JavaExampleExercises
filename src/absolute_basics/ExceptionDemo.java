package absolute_basics;

// exceptions signal that something happened that shouldn't have
// an exception usually needs to be handled
public class ExceptionDemo {

    public static void main(String[] args) {
        double frac;
        // TODO: why do we have to try/catch here?
        try {
            frac = divide(1, 2);
            System.out.printf("divide: %f\n", frac);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO: why don't we have to try/catch here?
        frac = divideNoThrows(1, 2);
        System.out.printf("divideNoThrows: %f\n", frac);
    }

    // the `throws` indicates that an exception might be thrown
    static double divide(double numerator, double denominator) throws Exception {
        if (denominator == 0) {
            // use throw to generate an exception
            throw new Exception("Division by zero");
        }
        return numerator / denominator;
    }

    // some exceptions (RuntimeExceptions) do not have to be explicitely declared and handled
    static double divideNoThrows(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}
