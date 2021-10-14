package g48962.atl.asciipaint.model;


/**
 * This class represents a square.
 *
 * @author Michel
 */
public class Square extends Rectangle {

    /**
     * This is the Square's constructor.
     *
     * @param upperLeft is the corner upper left of the square.
     * @param side is the square's side.
     * @param color is the square's color.
     */
    Square(Point upperLeft, double side, char color) {
        super(upperLeft, side, side, color);
    }

}
