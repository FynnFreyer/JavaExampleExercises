package math.geom;

/**
 * A line is an infinitely long, straight and has no curves.
 * It can be given as a linear equation (in 2D), via parameters or in Hesse normal form.
 * <p>
 * https://en.wikipedia.org/wiki/Line_(geometry)
 * <p>
 * TODO: implement a line class using parametric equations
 * https://www.youtube.com/watch?v=YZ3Q7oRjDBw
 */
public class Line {
    Point location, direction;

    public Line(Point location, Point direction) {
        this.location = location;
        this.direction = direction;
    }

    public boolean intersects(Line other) {
        // TODO: implement me
        return false;
    }

    public static Line fromPoints(Point a, Point b) {
        // TODO: implement me
        return null;
    }
}
