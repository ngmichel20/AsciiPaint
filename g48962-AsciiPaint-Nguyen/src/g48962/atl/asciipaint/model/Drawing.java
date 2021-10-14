package g48962.atl.asciipaint.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class allows to represent a "drawing sheet".
 *
 * @author g48962
 */
public class Drawing {

    private List<Shape> shapes = new ArrayList<>();
    private int height;
    private int witdh; //largeur

    /**
     * This is the default's constructor of Drawing.
     */
    Drawing() {    
        this(40, 40);
    }

    /**
     * This is the Drawing's constructor.
     *
     * @param is the height of the drawing.
     * @param is the width of the drawing.
     */
    Drawing(int height, int witdh) {
        this.height = height;
        this.witdh = witdh;
    }

    /**
     * This is the height's getter.
     */
    int getHeight() {
        return height;
    }

    /**
     * This is the width's getter.
     */
    int getWitdh() {
        return witdh;
    }

    /**
     * This method allows to add a shape.
     */
    void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * This method allows to get a shape which a point owns it.
     *
     * @param p is the point.
     * @return the shape which the point owns.
     */
    Shape getShapeAt(Point p) {
        for (Shape shape : shapes) {
            if (shape.isInside(p)) {
                return shape;
            }
        }
        return null;
    }

    /**
     * This method allows to get the color of the shape.
     *
     * @param p is the point.
     * @return a char.
     */
    char getColorShape(Point p) {
        for (Shape shape : shapes) {
            if (shape.isInside(p)) {
                return shape.getColor();
            }
        }
        return ' ';
    }

    /**
     * This method allows to remove a shape.
     *
     * @param idShape is the id of the shape.
     */
    void remove(int idShape) {
        shapes.remove(idShape);
    }

    /**
     * This methiod allows to move a shape.
     *
     * @param idShape is the id of the shape.
     * @param dx is the absciss's movement.
     * @param dy is the ordinate's movement.
     */
    void move(int idShape, double dx, double dy) {
        shapes.get(idShape).move(dx, dy);
    }
    
    /**
     * This method allows to modify the color of the shape.
     * @param idShape is the id of the shape.
     * @param color is the new color of the shape.
     */
    void setColor(int idShape,char color){
        shapes.get(idShape).setColor(color);
    }
    
}
