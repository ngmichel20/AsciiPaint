package g48962.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class DrawingTest {

    /**
     * Test of addShape method, of class Drawing.
     */
    @Test
    public void testAddShape() {
        System.out.println("addShape");
        Point center = new Point(4, 5);
        Shape shape = new Circle(center, 4, 'c');
        Drawing instance = new Drawing();
        instance.addShape(shape);
    }

    /**
     * Test of getShapeAt method, of class Drawing.
     */
    @Test
    public void testGetShapeAt() {
        System.out.println("getShapeAt");
        Point center = new Point(15, 15);
        Point point = new Point(15, 15);
        Drawing instance = new Drawing();
        Shape expResult = new Circle(center, 6, 'c');
        instance.addShape(expResult);
        Shape result = instance.getShapeAt(point);
        assertEquals(expResult, result);
    }

    /**
     * Test of getColorShape method, of class Drawing.
     */
    @Test
    public void testGetColorShape() {
        System.out.println("getColorShape");
        Point p = new Point(15, 15);
        Drawing instance = new Drawing();
        char expResult = 'c';
        Shape circle = new Circle(p, 4, 'c');
        instance.addShape(circle);
        char color = circle.getColor();
        char result = instance.getColorShape(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class Drawing.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int idShape = 0;
        Point center = new Point(4, 4);
        Drawing instance = new Drawing();
        Shape circle = new Circle(center, 3, 'c');
        instance.addShape(circle);
        instance.remove(idShape);
    }

    /**
     * Test of move method, of class Drawing.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int idShape = 0;
        double dx = 5.0;
        double dy = 5.0;
        Drawing instance = new Drawing();
        Shape circle = new Circle(new Point(4, 5), 4, 'r');
        instance.addShape(circle);
        instance.move(idShape, dx, dy);
    }

    /**
     * Test of setColor method, of class Drawing.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        int idShape = 0;
        char color = 's';
        Drawing instance = new Drawing();
        Shape circle = new Circle(new Point(4, 5), 4, 'r');
        instance.addShape(circle);
        instance.setColor(idShape, color);
    }
    
}
