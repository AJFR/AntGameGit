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
public class WorldTest {
    
    public WorldTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getGameBoard method, of class World.
     */
    @Test
    public void testGetGameBoard() {
        System.out.println("getGameBoard");
        World instance = new World();
        Cell[][] expResult = null;
        Cell[][] result = instance.getGameBoard();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAnt method, of class World.
     */
    @Test
    public void testAddAnt() {
        System.out.println("addAnt");
        int c = 0;
        int r = 0;
        Ant ant = null;
        World instance = new World();
        instance.addAnt(c, r, ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAnt method, of class World.
     */
    @Test
    public void testRemoveAnt() {
        System.out.println("removeAnt");
        int c = 0;
        int r = 0;
        World instance = new World();
        Ant expResult = null;
        Ant result = instance.removeAnt(c, r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMarker method, of class World.
     */
    @Test
    public void testAddMarker() {
        System.out.println("addMarker");
        int c = 0;
        int r = 0;
        int marker = 0;
        Ant ant = null;
        World instance = new World();
        instance.addMarker(c, r, marker, ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMarker method, of class World.
     */
    @Test
    public void testRemoveMarker() {
        System.out.println("removeMarker");
        int c = 0;
        int r = 0;
        int marker = 0;
        Ant ant = null;
        World instance = new World();
        instance.removeMarker(c, r, marker, ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpFood method, of class World.
     */
    @Test
    public void testPickUpFood() {
        System.out.println("pickUpFood");
        int c = 0;
        int r = 0;
        World instance = new World();
        instance.pickUpFood(c, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dropFood method, of class World.
     */
    @Test
    public void testDropFood() {
        System.out.println("dropFood");
        int c = 0;
        int r = 0;
        World instance = new World();
        instance.dropFood(c, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of senseMarker method, of class World.
     */
    @Test
    public void testSenseMarker() {
        System.out.println("senseMarker");
        int c = 0;
        int r = 0;
        int marker = 0;
        Ant ant = null;
        World instance = new World();
        instance.senseMarker(c, r, marker, ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of senseAnyMarker method, of class World.
     */
    @Test
    public void testSenseAnyMarker() {
        System.out.println("senseAnyMarker");
        int c = 0;
        int r = 0;
        Ant ant = null;
        World instance = new World();
        instance.senseAnyMarker(c, r, ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnLeft method, of class World.
     */
    @Test
    public void testTurnLeft() {
        System.out.println("turnLeft");
        Ant ant = null;
        World instance = new World();
        instance.turnLeft(ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnRight method, of class World.
     */
    @Test
    public void testTurnRight() {
        System.out.println("turnRight");
        Ant ant = null;
        World instance = new World();
        instance.turnRight(ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByPos method, of class World.
     */
    @Test
    public void testGetByPos() {
        System.out.println("getByPos");
        int c = 0;
        int r = 0;
        World instance = new World();
        Cell expResult = null;
        Cell result = instance.getByPos(c, r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNeighbours method, of class World.
     */
    @Test
    public void testSetNeighbours() {
        System.out.println("setNeighbours");
        Cell cell = null;
        World instance = new World();
        instance.setNeighbours(cell);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveAnt method, of class World.
     */
    @Test
    public void testMoveAnt() {
        System.out.println("moveAnt");
        Ant ant = null;
        World instance = new World();
        instance.moveAnt(ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kill method, of class World.
     */
    @Test
    public void testKill() {
        System.out.println("kill");
        Ant ant = null;
        World instance = new World();
        instance.kill(ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
