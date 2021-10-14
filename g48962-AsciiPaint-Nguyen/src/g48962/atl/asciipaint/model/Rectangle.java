package g48962.atl.asciipaint.model;

/**
 * This class represents a rectangle.
 *
 * @author Michel
 */
public class Rectangle extends ColoredShape {

    private Point upperLeft;
    private double width;
    private double height;

    /**
     * This is the Rectangle's constructor.
     *
     * @param upperLeft is the corner upper left of the rectangle.
     * @param width is the width of the rectangle.
     * @param height is the height of the rectangle.
     * @param color is the color of the rectangle.
     */
    Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    /**
     * This is the upperLeft's getter.
     *
     * @return a point.
     */
    Point getUpperLeft() {
        return upperLeft;
    }

    /**
     * This is the width's getter.
     *
     * @return the width.
     */
    double getWidth() {
        return width;
    }

    /**
     * This is the height's getter.
     *
     * @return the height.
     */
    double getHeight() {
        return height;
    }

    /**
     * This method allows to know if the point is inside of the rectangle.
     *
     * @param p is the point to check.
     * @return true is the point is inside of the rectangle.
     */
    @Override
    public boolean isInside(Point p) {
        return (p.getX() >= this.upperLeft.getX()
                && p.getX() <= this.upperLeft.getX() + this.width-1)
                && (p.getY() <= this.upperLeft.getY()
                && p.getY() >= this.upperLeft.getY() - height + 1);
    }

    /**
     * This methos allows to move the rectangle.
     *
     * @param dx is the absciss's movement.
     * @param dy is the ordinate's movement.
     */
    @Override
    public void move(double dx, double dy) {
        upperLeft.move(dx, dy);
    }

}
