package g48962.atl.asciipaint.model;


/**
 * This class is the facade of AsciiPaint.
 *
 * @author Michel
 */
public class AsciiPaint {

    private Drawing drawing;

    /**
     * This is the default constructor of AsciiPaint.
     */
    public AsciiPaint() {
        this.drawing = new Drawing();
    }

    /**
     * This is a constructor of AsciiPaint.
     *
     * @param width is the width of the drawing.
     * @param height is the height of the drawing.
     */
    public AsciiPaint(int width, int height) {
        this.drawing = new Drawing(height, width);
    }

    /**
     * This is the getter of drawing.
     * 
     * @return the drawing.
     */
    public Drawing getDrawing() {
        return drawing;
    }
    
    /**
     * This method allows to create a circle.
     *
     * @param x is the absciss of the circle.
     * @param y is the ordinate of the circle.
     * @param radius is the radius of the circle.
     * @param color is the color of the circle.
     */
    public void newCircle(int x, int y, double radius, char color) {
        this.drawing.addShape(new Circle(new Point(x, y), radius, color));
    }

    /**
     * This method allows to create a rectangle.
     *
     * @param x is the absciss of the rectangle.
     * @param y is the ordinate of the rectangle.
     * @param width is the width of the rectangle.
     * @param height is the height of the rectangle.
     * @param color is the color of the rectangle.
     */
    public void newRectangle(int x, int y, double width, double height, char color) {
        this.drawing.addShape(new Rectangle(new Point(x, y), width, height, color));
    }

    /**
     * This method allows to create a square.
     *
     * @param x is the absciss of the square.
     * @param y is the ordinate of the square.
     * @param side is the side of the square.
     * @param color is color of the square.
     */
    public void newSquare(int x, int y, double side, char color) {
        this.drawing.addShape(new Square(new Point(x, y), side, color));
    }

    /**
     * This method allows to remove a shape.
     *
     * @param idShape is the id of the shape.
     */
    public void removeShapeAt(int idShape) {
        drawing.remove(idShape);
    }

    /**
     * This methiod allows to move a shape.
     *
     * @param idShape is the id of the shape.
     * @param dx is the absciss's movement.
     * @param dy is the ordinate's movement.
     */
    public void moveShapeAt(int idShape, double dx, double dy) {
        drawing.move(idShape, dx, dy);
    }
    
    /**
     * Permet de modifier la couleur
     * @param idShape l'id de la forme à modifier
     * @param color la nouvelle couleur
     */
    public void setColor(int idShape, char color){
        drawing.setColor(idShape, color);
    }
    

    /**
     * This method allows to get the height of the shape.
     *
     * @return the height.
     */
    public int getHeight() {
        return drawing.getHeight();
    }

    /**
     * This method allows to get the width of the shape.
     *
     * @return the width.
     */
    public int getWidth() {
        return drawing.getWitdh();
    }

    /**
     * This method allows to get the color of the shape.
     *
     * @param x is the abcsiss of the shape.
     * @param y is the ordinate of the shape.
     * @return the color.
     */
    public char getColor(int x, int y) {
        Point point = new Point(x, y);
        return drawing.getColorShape(point);
    }
}
