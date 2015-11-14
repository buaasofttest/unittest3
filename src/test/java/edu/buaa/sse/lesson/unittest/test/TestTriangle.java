/**
 * Created by tina on 2015/11/14.
 */

package edu.buaa.sse.lesson.unittest.test;

import static org.junit.Assert.*;

import edu.buaa.sse.lesson.unittest.Triangle;
import org.junit.Test;


public class TestTriangle {
    @Test
    public void testTriangle_legal() {
        Triangle t = new Triangle(2, 2, 3);
        assertTrue(t.isTriangle());
    }

    @Test
    public void testTriangle_illegal() {
        Triangle t = new Triangle(1, 2, 3);
        assertFalse(t.isTriangle());
    }
}