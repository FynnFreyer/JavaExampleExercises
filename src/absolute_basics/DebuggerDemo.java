package absolute_basics;

public class DebuggerDemo {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4};
        int sum = sum(data);
        System.out.println(sum);
    }

    public static int sum(int[] data) {
        int accum = 0;
        for (int num : data) {
            accum = sum(accum, num);  // TODO: add a break point here that triggers on num >= 4
        }
        return accum;  // TODO: add a break point here
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);  // TODO: add a break point here that triggers on sum >= 4
        return sum;
    }
}
