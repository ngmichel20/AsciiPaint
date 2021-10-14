package g48962.atl.asciipaint.model;


/**
 * This class represents a circle.
 *
 * @author g48962
 */
public class Circle extends ColoredShape {

    private Point center;
    private double radius;

    /**
     * This is the constructor of Circle.
     *
     * @param center is the point of the circle's center.
     * @param radius is the circle's radius.
     * @param color is the circle's color.
     */
    Circle(Point center, double radius, char color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    /**
     * This is center's getter.
     *
     * @return the point of the circle's center.
     */
    Point getCenter() {
        return center;
    }

    /**
     * This is the radius's getter.
     *
     * @return the radius of the circle.
     */
    double getRadius() {
        return radius;
    }

    /**
     * This method checks if the point is inside of the circle.
     *
     * @param p is the point to check.
     * @return true is the point is inside of the circle.
     */
    @Override
    public boolean isInside(Point p) {     
        return ((Math.pow(p.getX() - center.getX(), 2) 
                + (Math.pow(center.getY() - p.getY(), 2)))) 
                < Math.pow(radius, 2);
    }

    /**
     * This method allows to move the circle.
     *
     * @param dx is the absciss's movement.
     * @param dy is the ordinate's movement.
     */
    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }
}
