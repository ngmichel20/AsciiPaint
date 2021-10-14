package g48962.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class AsciiPaintTest {

    /**
     * Test of newCircle method, of class AsciiPaint.
     */
    @Test
    public void testNewCircle() {
        System.out.println("newCircle");
        int x = 5;
        int y = 5;
        double radius = 4.0;
        char color = 'c';
        AsciiPaint instance = new AsciiPaint();
        instance.newCircle(x, y, radius, color);
    }

    /**
     * Test of newRectangle method, of class AsciiPaint.
     */
    @Test
    public void testNewRectangle() {
        System.out.println("newRectangle");
        int x = 5;
        int y = 5;
        double width = 4.0;
        double height = 3.0;
        char color = 'r';
        AsciiPaint instance = new AsciiPaint();
        instance.newRectangle(x, y, width, height, color);
    }

    /**
     * Test of newSquare method, of class AsciiPaint.
     */
    @Test
    public void testNewSquare() {
        System.out.println("newSquare");
        int x = 5;
        int y = 5;
        double side = 4.0;
        char color = ' ';
        AsciiPaint instance = new AsciiPaint();
        instance.newSquare(x, y, side, color);
    }

    /**
     * Test of removeShapeAt method, of class AsciiPaint.
     */
    @Test
    public void testRemoveShapeAt() {
        System.out.println("removeShapeAt");
        int idShape = 0;
        AsciiPaint instance = new AsciiPaint();
        Shape circle = new Circle(new Point(4, 3), 4, 'c');
        instance.getDrawing().addShape(circle);
        instance.removeShapeAt(idShape);
    }

    /**
     * Test of moveShapeAt method, of class AsciiPaint.
     */
    @Test
    public void testMoveShapeAt() {
        System.out.println("moveShapeAt");
        int idShape = 0;
        double dx = 5.0;
        double dy = 5.0;
        AsciiPaint instance = new AsciiPaint();
        Shape circle = new Circle(new Point(4, 3), 4, 'c');
        instance.getDrawing().addShape(circle);
        instance.moveShapeAt(idShape, dx, dy);
    }
    
}
