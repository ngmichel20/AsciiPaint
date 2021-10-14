package g48962.atl.asciipaint.model;


/**
 * This class represents a shape.
 *
 * @author g48962
 */
public interface Shape {

    /**
     * This method allows to know if the point is inside of the shape.
     *
     * @param p is the point to check.
     * @return true is the point is inside of the shape.
     */
    boolean isInside(Point p);

    /**
     * This method allows to move the shape.
     *
     * @param dx is the absciss's movement.
     * @param dy is the ordinate's movement.
     */
    void move(double dx, double dy);

    /**
     * This method allows to get the color of the shape.
     *
     * @return a character for the shape's color.
     */
    char getColor();
    
    
    /**
     * This method allows to change the shape's color.
     * 
     * @param color is the color we want to change.
     */
    void setColor(char color);
}
