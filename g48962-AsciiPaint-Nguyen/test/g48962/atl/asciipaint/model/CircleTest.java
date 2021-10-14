package g48962.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class CircleTest {
    
    /**
     * Test of isInside method, of class Circle.
     */
    @Test
    public void testIsInside() {
        System.out.println("isInside");
        Point p = new Point(5, 5);
        Circle instance = new Circle(p, 4, 'c');
        boolean expResult = true;
        boolean result = instance.isInside(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Circle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        double dx = 4.0;
        double dy = 4.0;
        Point center = new Point(5, 5);
        Circle instance = new Circle(center, 4, 'c');
        instance.move(dx, dy);
    }
    
}
