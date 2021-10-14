package g48962.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class PointTest {
    /**
     * Test of move method, of class Point.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        double dx = 5.0;
        double dy = 5.0;
        Point instance = new Point(4, 5);
        instance.move(dx, dy);
    }

    /**
     * Test of distanceTo method, of class Point.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        Point other = new Point(15, 15);
        Point instance = new Point(1, 1);
        double expResult = 15.0;
        double result = instance.distanceTo(other);
        assertEquals(expResult, result, 7);
    }
}
