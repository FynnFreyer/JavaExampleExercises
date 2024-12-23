package arrays;

/**
 * TODO: use this to compare your solution
 */
public class Array3D {
    int m;
    int n;
    int o;
    int[] data;

    public Array3D(int m, int n, int o) {
        this.m = m;
        this.n = n;
        this.o = o;
        data = new int[m * n * o];
    }

    int index3D(int row, int col, int sheet) {
        return row + col * this.n + sheet * this.m * this.n;
    }

    int get(int row, int col, int sheet) {
        return data[index3D(row, col, sheet)];
    }
    void set(int value, int row, int col, int sheet) {
        data[index3D(row, col, sheet)] = value;
    }

}
