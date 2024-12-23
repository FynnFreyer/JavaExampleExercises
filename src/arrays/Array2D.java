package arrays;

/**
 * Showcases how to write 2-dimensional arrays into 1-dimensional memory.
 * TODO (extra):
 *   write a class for 3d-data that uses a one dimensional backing array
 *   extra extra: generalize to n dimensions
 */
public class Array2D {
    int m;
    int n;
    int[] data;

    public Array2D(int m, int n) {
        this.m = m;
        this.n = n;
        data = new int[m * n];
    }

    // TODO: why can this not be static?
    int index2D(int row, int col) {
        return row * this.n + col;
    }

    int get(int row, int col) {
        return data[index2D(row, col)];
    }
    void set(int value, int row, int col) {
        data[index2D(row, col)] = value;
    }
}
