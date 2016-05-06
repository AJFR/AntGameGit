/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freakin
 */
public class AntTest {
    Ant ant;
    Cell cell;
    World world;
    public AntTest() {
    }
    
    @Before
    public void setUp() {
       cell = new Cell(0,0,'-');
       ant = new Ant(1,0,cell,0);
    }

    /**
     * Test of getColour method, of class Ant.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        assertEquals(0, ant.getColour());
    }

    /**
     * Test of getCell method, of class Ant.
     */
    @Test
    public void testGetCell() {
        System.out.println("getCell");
        assertEquals(cell, ant.getCell());
    }

    /**
     * Test of changeDirection method, of class Ant.
     */
    @Test
    public void testChangeDirection() {
        System.out.println("changeDirection");
        ant.changeDirection(1);
        assertEquals(ant.getDir(), 1);
    }

    /**
     * Test of turnLeft method, of class Ant.
     */
    @Test
    public void testTurnLeft() {
        System.out.println("turnLeft");
        ant.turnLeft();
        assertEquals(ant.getDir(), 5);
    }

    /**
     * Test of turnRight method, of class Ant.
     */
    @Test
    public void testTurnRight() {
        System.out.println("turnRight");
        Ant instance = null;
        instance.turnRight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeCell method, of class Ant.
     */
    @Test
    public void testChangeCell() {
        System.out.println("changeCell");
        Cell cell = null;
        Ant instance = null;
        instance.changeCell(cell);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isResting method, of class Ant.
     */
    @Test
    public void testIsResting() {
        System.out.println("isResting");
        Ant instance = null;
        boolean expResult = false;
        boolean result = instance.isResting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rest method, of class Ant.
     */
    @Test
    public void testRest() {
        System.out.println("rest");
        Ant instance = null;
        instance.rest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseRest method, of class Ant.
     */
    @Test
    public void testDecreaseRest() {
        System.out.println("decreaseRest");
        Ant instance = null;
        instance.decreaseRest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDir method, of class Ant.
     */
    @Test
    public void testGetDir() {
        System.out.println("getDir");
        Ant instance = null;
        int expResult = 0;
        int result = instance.getDir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFood method, of class Ant.
     */
    @Test
    public void testHasFood() {
        System.out.println("hasFood");
        Ant instance = null;
        boolean expResult = false;
        boolean result = instance.hasFood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpFood method, of class Ant.
     */
    @Test
    public void testPickUpFood() {
        System.out.println("pickUpFood");
        Ant instance = null;
        instance.pickUpFood();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dropFood method, of class Ant.
     */
    @Test
    public void testDropFood() {
        System.out.println("dropFood");
        Ant instance = null;
        instance.dropFood();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
