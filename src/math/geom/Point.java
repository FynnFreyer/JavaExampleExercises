package math.geom;

public class Point {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        Point q = new Point(2, 1);
        System.out.println(p.norm());
        System.out.println(p.dist(q));
    }

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // TODO: how does this affect printing points?
    @Override
    public String toString() {
        return "(" + x + ", "  + y + ")";
    }

    public Point diff(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return new Point(dx, dy);
    }

    /**
     * @return distance to coordinate origin
     */
    public double norm() {
        double xSq = Math.pow(this.x, 2);
        double ySq = Math.pow(this.y, 2);
        return Math.sqrt(xSq + ySq);
    }

    /**
     * @param other another point
     * @return distance to other point
     */
    public double dist(Point other) {
        Point delta = this.diff(other);
        return delta.norm();
    }

    /**
     * @return create a new point with same direction and length 1
     */
    public Point normalize() {
        double dist = this.norm();
        double normX = this.x / dist;
        double normY = this.y / dist;
        return new Point(normX, normY);
    }

    /**
     * Creates a Point from polar coordinates, as opposed to cartesian coordinates.
     *
     * https://en.wikipedia.org/wiki/Polar_coordinate_system
     * https://en.wikipedia.org/wiki/Cartesian_coordinate_system
     *
     * @param radius distance from the pole
     * @param angle angle in radians
     * @return a new Point
     */
    public static Point fromPolarCoords(double radius, double angle) {
        // TODO: implement me
        // TODO (extra):
        //  try to implement this in a constructor instead.
        //  what happens, and why? read the errors to find out!
        return null;
    }
}
