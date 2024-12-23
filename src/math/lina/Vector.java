package math.lina;

import java.util.Arrays;

/**
 * Points in n dimensional spaces
 * YOU SHOULD STEAL from math.geom.Point when working on this.
 *
 * <p>
 * DONE (extra):
 * what should happen when processing two vectors with different dimensions?
 * use exceptions here, but think about what kind of exception and why.
 * .
 * See assertDims. we use RuntimeExceptions because the programmer should have control over dimensions
 * and we want to avoid the verbosity of checked exceptions here
 */
public class Vector {
    double[] coordinates;

    // DONE: why can we have two constructors here?
    //  because their signatures are different
    public Vector(int dim) {
        coordinates = new double[dim];
    }

    public Vector(double[] coords) {
        coordinates = coords;
    }

    public static void main(String[] args) {
        Vector v = new Vector(new double[]{1, 2});
        System.out.println(v);
    }

    // DONE: add getter and setter that takes an index and returns/sets the coordinate there
    public double get(int i) {
        return coordinates[i];
    }

    public void set(int i, double val) {
        this.coordinates[i] = val;
    }

    // DONE: how could `add` and `diff` be expressed in terms of one another (i.e. without duplication)
    //  v - u = v + (u * (-1))

    /**
     * Scale a vector, i.e., multiply with a scalar.
     *
     * @return the scaled vector
     */
    public Vector scale(double scalar) {
        double[] scaled = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            scaled[i] = coordinates[i] * scalar;
        }
        return new Vector(scaled);
    }

    private void assertDims(Vector other) {
        if (this.coordinates.length != other.coordinates.length) {
            throw new RuntimeException("Different dimensions");
        }
    }

    /**
     * Add two vectors of same dimensionality.
     *
     * @return the added vector
     */
    public Vector add(Vector other) {
        assertDims(other);
        double[] sum = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            sum[i] = this.coordinates[i] + other.coordinates[i];
        }
        return new Vector(sum);
    }

    /**
     * Subtract two vectors of same dimensionality.
     *
     * @return the difference vector
     */
    public Vector diff(Vector other) {
        return add(other.scale(-1));
    }

    /**
     * Determine the inner product of two vectors of same dimensionality.
     * <p>
     * https://en.wikipedia.org/wiki/Dot_product
     *
     * @return the euclidian distance to the coordinate origin
     */
    public double dotProduct(Vector other) {
        assertDims(other);
        double product = 1;
        for (int i = 0; i < coordinates.length; i++) {
            product *= this.coordinates[i] + other.coordinates[i];
        }
        return product;
    }

    /**
     * Checks whether two vectors are orthogonal to one another.
     *
     * @param other   another vector
     * @param epsilon DONE: why do we want a `double epsilon` parameter here?
     *                Because floating point operations are not infinitely precise,
     *                so we measure equality as "close enough" and not as true equality
     * @return whether the vectors are orthogonal
     */
    public boolean isOrthogonal(Vector other, double epsilon) {
        // DONE: implement me using dotProduct
        return dotProduct(other) <= Math.abs(epsilon);
    }

    /**
     * Calculate the euclidian distance to the coordinate origin.
     *
     * @return distance to the origin
     */
    public double norm() {
        // DONE: implement me using dotProduct
        return Math.sqrt(dotProduct(this));
    }

    /**
     * Distance between two vectors of same dimensionality.
     *
     * @return the euclidian distance to the other vector
     */
    public double dist(Vector other) {
        // DONE: implement me using norm
        return diff(other).norm();
    }

    /**
     * Calculates a vector with same direction and length one.
     *
     * @return a vector with same direction and length one
     */
    public Vector normalize() {
        // DONE: implement me using norm and scale
        return scale(1 / norm());
    }

    @Override
    public String toString() {
        return "Vec " + Arrays.toString(coordinates);
    }
}
