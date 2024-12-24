package absolute_basics;

// We differentiate between EXPRESSIONS and STATEMENTS.
// Expressions are things that can be resolved to a value, e.g., 1+1, or "the cosine of the second number in list l")
// Statements state that an action should be taken, e.g., loops and conditionals or "assign the value 1 to the name x"
public class ExpressionStatementDemo {
    public static void main(String[] args) {
        // set breakpoints in the individual methods and step through them to see what's going on
        declareAssignExample();
        augmentedAssignmentAndIncrementDecrementExample();
        whileExample(100);
        forExample(100);
        ifExample("Hola", true, true);
        switchExample('X');
    }

    static void declareAssignExample() {
        // variable declarations are statements
        // "a variable x of type double exists"
        double x;
        // assignments are statements too, but they need an expression on the right hand side
        x = 3;

        // declaration and assignments can be combined into one step
        // method calls are expressions that evaluate to whatever the method returns
        double y = Math.sin(x);

    }
    static int augmentedAssignmentAndIncrementDecrementExample() {
        // declare variable i and assign two to it
        int i = 2;

        // assignments to existing variables can be "augmented"
        i += 5;  // add 5 to i; equivalent to i = i + 5
        System.out.println(i);
        i /= 2;  // divide i by 2 (integer division); equivalent to i = i / 2
        System.out.println(i);
        i %= 2;  // assign modulo 2; equivalent to i = i % 2
        System.out.println(i);

        // there are increment and decrement operators
        i++;  // increment "after" -> i = i + 1
        i--;  // decrement "after" -> i = i - 1
        ++i;  // increment "before" -> i = i + 1
        --i;  // decrement "before" -> i = i - 1

        // "before" and "after" are only relevant in some specific situations
        int[] arr = new int[]{0, 1, 2, 3};
        int numA = arr[i++];  // get the index first, then increment afterwards
        int numB = arr[--i];  // decrement first, then get the index afterwards
        // mnemonic:
        //  ++ before the variable -> increment before
        //  ++ after the variable -> increment after
        return (numA + numB) * i;
    }

    static int whileExample(double val) {
        int i = 0;
        // do something as long as a condition is met
        while (Math.abs(val) >= 1) {
            System.out.println("val is " + val);
            val /= 2;
            i++;
        }
        return i;
    }

    static double[] forExample(int n) {
        double[] nums = new double[n];
        double[] squares = new double[n];
        double[] squareNumSums = new double[n];
        // do something for a specified amount of times
        for (int i = 0; i < n; i++) {
            nums[i] = i;
            squares[i] = Math.pow(i, 2);
            squareNumSums[i] = nums[i] + squares[i];
        }

        // do something for each thing in a collection
        for (double half : squares) {
            System.out.println(half);
        }

        return squareNumSums;
    }

    static String ifExample(String msg, boolean capitalize, boolean newline) {
        // if STATEMENT: do something if condition is true
        if (capitalize) {
            msg = msg.toUpperCase();
        } else if (msg.length() > 80) {
            msg = "Message too long to be capitalized!";
        }

        // if you ever write something like: if (val == true) {...},
        // I will personally curse your sorry ass

        // ternary (if) EXPRESSION (has to have an else)
        // equivalent to: if (newline) { c = '\n' } else { c = ' ' }
        char c = newline ? '\n' : ' ';
        return msg + c;
    }

    static int switchExample(char note) {
        // switches define what to do based on a given value
        // switch EXPRESSION (has to have default)
        int noteVal = switch (note) {
            case 'C' -> 0;
            case 'D' -> 1;
            case 'E' -> 2;
            case 'F' -> 3;
            case 'G' -> 4;
            case 'A' -> 5;
            case 'H' -> 6;
            default -> -1;
        };
        // switch STATEMENT (may or may not have a default)
        switch (noteVal) {
            case -1:
                System.out.println("Unknown note");
            case 1:
                System.out.println("Saw D");
                break;
            case 3:
                System.out.println("Saw F");
                break;
            default:
                System.out.println("Saw something else");
        }
        return noteVal;
    }
}
