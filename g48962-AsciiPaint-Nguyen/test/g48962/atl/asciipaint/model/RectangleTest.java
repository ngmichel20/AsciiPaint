package g48962.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class RectangleTest {

    /**
     * Test of isInside method, of class Rectangle.
     */
    @Test
    public void testIsInside() {
        System.out.println("isInside");
        Point p = new Point(4, 4);
        Rectangle instance = new Rectangle(p, 4, 3, 'r');
        boolean expResult = true;
        boolean result = instance.isInside(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Rectangle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Point upperLeft = new Point(5, 5);
        double dx = 5.0;
        double dy = 7.0;
        Rectangle instance = new Rectangle(upperLeft, dy, dy, 'r');
        instance.move(dx, dy);
    }
    
}
