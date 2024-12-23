package data;

/**
 * An ordered pair.
 *
 * <p>Example of a simple generic class.
 *
 * @param <T> type of the first field
 * @param <U> type of the second field
 */
public class Tuple<T, U> {
    T fst;
    U snd;

    // here we write the constructor
    // the only difference is the use of type variables instead of concrete types
    public Tuple(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public static void main(String[] args) {
        // instantiate a tuple object that holds String and Integer
        Tuple<String, Integer> stringIntegerTuple = new Tuple<String, Integer>("Hello", 1);

        // there is no need to provide the type parameters twice, java can infer them from the signature
        Tuple<Integer, String> integerStringTuple = new Tuple<>(1, "Hello");

        // the attributes type depends on how the object was parametrized
        String concatName = stringIntegerTuple.fst + " " + integerStringTuple.snd;
        int sum = stringIntegerTuple.snd + integerStringTuple.fst;
        System.out.println(concatName + " " + sum);
    }
}
