package math.geom;

/**
 * A line segment.
 * <p>
 * https://en.wikipedia.org/wiki/Line_segment
 */
public class Segment {
    Point start;
    Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Determine the length of this line segment.
     * @return length of the segment
     */
    public double length() {
        // TODO: this works. why? where did we implement the logic?
        return start.dist(end);
    }

    /**
     * Determine whether two line segments intersect.
     * <p>
     * https://en.wikipedia.org/wiki/Intersection_(geometry)
     *
     * @param other another line segment
     * @return whether the segments intersect or not
     */
    public boolean intersects(Segment other) {
        // TODO: implement me
        // TODO (extra):
        //  write another method that determines the point of intersection
        //  try to minimize code duplication
        //  this is hard, because there can be zero, one or infinite solutions
        //  for zero return null, for infinite solutions any point of intersection
        return false;
    }
}