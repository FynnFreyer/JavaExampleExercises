package math.geom;

public class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isDegenerate() {
        return false;
    }

    double[] getDegrees() {
        return null;
    }
}
