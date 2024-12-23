package math.lina;

import java.util.Arrays;

/**
 * Points in n dimensional spaces
 * YOU SHOULD STEAL from math.geom.Point when working on this.
 *
 * <p>
 * TODO (extra):
 *   what should happen when processing two vectors with different dimensions?
 *   use exceptions here, but think about what kind of exception and why.
 */
public class Vector {
    double[] coordinates;

    public static void main(String[] args) {
        Vector v = new Vector(new double[]{1, 2});
        System.out.println(v);
    }

    // TODO: why can we have two constructors here?
    public Vector(int dim) {
        coordinates = new double[dim];
    }

    public Vector(double[] coords) {
        coordinates = coords;
    }

    // TODO: add getter and setter that takes an index and returns/sets the coordinate there

    // TODO: how could `add` and `diff` be expressed in terms of one another (i.e. without duplication)

    /**
     * Scale a vector, i.e., multiply with a scalar.
     *
     * @return the scaled vector
     */
    public Vector scale(double scalar) {
        // TODO: implement me
        return null;
    }

    /**
     * Add two vectors of same dimensionality.
     *
     * @return the added vector
     */
    public Vector add(Vector other) {
        // TODO: implement me
        return null;
    }

    /**
     * Subtract two vectors of same dimensionality.
     *
     * @return the difference vector
     */
    public Vector diff(Vector other) {
        // TODO: implement me using scale and add
        return null;
    }

    /**
     * Determine the inner product of two vectors of same dimensionality.
     * <p>
     * https://en.wikipedia.org/wiki/Dot_product
     *
     * @return the euclidian distance to the coordinate origin
     */
    public double dotProduct(Vector other) {
        // TODO: implement me
        return -1;
    }

    /**
     * Checks whether two vectors are orthogonal to one another.
     *
     * @param other   another vector
     * @param epsilon TODO: why do we want a `double epsilon` parameter here?
     * @return whether the vectors are orthogonal
     */
    public boolean isOrthogonal(Vector other, double epsilon) {
        // TODO: implement me using dotProduct
        return false;
    }


    /**
     * Calculate the euclidian distance to the coordinate origin.
     *
     * @return distance to the origin
     */
    public double norm() {
        // TODO: implement me using dotProduct
        return -1;
    }

    /**
     * Distance between two vectors of same dimensionality.
     *
     * @return the euclidian distance to the coordinate origin
     */
    public double dist(Vector other) {
        // TODO: implement me using norm
        return -1;
    }

    /**
     * Calculates a vector with same direction and length one.
     *
     * @return a vector with same direction and length one
     */
    public Vector normalize() {
        // TODO: implement me using norm and scale
        return null;
    }

    @Override
    public String toString() {
        return "Vec " + Arrays.toString(coordinates);
    }
}
