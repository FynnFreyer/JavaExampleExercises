package arrays;

/**
 * TODO: use this to compare your solution
 */
public class NDArray {
    int[] shape;
    int[] data;

    public NDArray(int[] shape) {
        this.shape = shape;
        this.data = new int[product(shape)];
    }

    private static int product(int[] data) {
        int product = 1;
        for (int datum : data) {
            product *= datum;
        }
        return product;
    }

    boolean inRange(int min, int val, int max) {
        return min <= val && val < max;
    }

    int getIndex(int... coords) {
        if (coords.length != shape.length) {
            throw new RuntimeException("Number of coordinates differs from shape");
        }

        int index = 0;
        int offsetFactor = 1;
        for (int dim = 0; dim < shape.length; dim++) {
            // get the dim length from shape
            int len = shape[dim];
            // and coordinate from param list
            int coord = coords[dim];

            // ensure that coordinate is within bounds
            if (coord < 0 || len <= coord) {
                throw new ArrayIndexOutOfBoundsException("Out of bounds");
            }

            // add the coordinate offset to the index
            index += offsetFactor * coord;

            // amend offset factor
            offsetFactor *= len;
        }
        return index;
    }

    public int get(int... coords) {
        return data[getIndex(coords)];
    }

    public void set(int val, int... coords) {
        data[getIndex(coords)] = val;
    }
}
