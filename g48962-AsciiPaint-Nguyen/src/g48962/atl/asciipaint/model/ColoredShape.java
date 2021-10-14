package g48962.atl.asciipaint.model;


/**
 * This class allows to give a color to a shape.
 *
 * @author g48962
 */
public abstract class ColoredShape implements Shape {

    private char color;

    /**
     * This is the ColoredShape's constructor.
     *
     * @param color is the color.
     */
    ColoredShape(char color) {
        this.color = color;
    }

    /**
     * This is the color's getter.
     *
     * @return the color.
     */
    @Override
    public char getColor() {
        return color;
    }
    
    @Override
    public void setColor(char color) {
        this.color = color;
    }
}
