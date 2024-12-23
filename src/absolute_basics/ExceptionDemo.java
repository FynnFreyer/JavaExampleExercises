package absolute_basics;

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

    static double divide(double numerator, double denominator) throws Exception {
        if (denominator == 0) {
            throw new Exception("Division by zero");
        }
        return numerator / denominator;
    }

    static double divideNoThrows(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}
