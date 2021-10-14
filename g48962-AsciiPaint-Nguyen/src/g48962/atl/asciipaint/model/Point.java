package g48962.atl.asciipaint.model;

/**
 * This class represents a point.
 *
 * @author g48962
 */
public class Point {

    private double x;
    private double y;

    /**
     * This is the Point's constructor.
     *
     * @param x is the absciss.
     * @param y is the ordinate.
     */
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This is an other constructor of Point.
     *
     * @param p is the point.
     */
    Point(Point p) {
        this(p.x, p.y);
    }

    /**
     * This is the getter of x.
     *
     * @return the absciss.
     */
    double getX() {
        return x;
    }

    /**
     * This is the setter of x.
     *
     * @param x is the absciss.
     */
    void setX(double x) {
        this.x = x;
    }

    /**
     * This is the getter of y.
     *
     * @return the ordinate.
     */
    double getY() {
        return y;
    }

    /**
     * This is the setter of y;
     *
     * @param y is the ordinate.
     */
    void setY(double y) {
        this.y = y;
    }

    /**
     * This method allows to move the point.
     *
     * @param dx is the absciss's movement.
     * @param dy is the ordinate's movement.
     */
    void move(double dx, double dy) {
        this.x = +dx;
        this.y = +dy;
    }

    /**
     * This method calculates the distance between 2 points.
     *
     * @param other is the other point.
     * @return the distance between these 2 points.
     */
    double distanceTo(Point other) {
        double distanceX = other.x - this.x;
        double distanceY = other.y - this.y;
        return Math.sqrt((Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
    }
}
