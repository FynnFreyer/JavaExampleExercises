package math;

public class EulerPhi {
    /**
     * Calculates the greatest common divisor.
     */
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculates Euler's phi function.
     */
    static int phi(int n) {
        int p = 0;
        for (int m = 1; m < n; m++) {
            if (gcd(m, n) == 1) {
                p++;
            }
        }
        return p;
    }
}
