/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ajfr20
 */
public class CellTest {
    public Cell cell;
    public CellTest() {
    }
    
    @Before
    public void setUp() {
        cell = new Cell(1,2,true,false,1);
    }

    /**
     * Test of getRow method, of class Cell.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        int expResult = 1;
        int result = cell.getRow();
        assertEquals(expResult,result);
    }

    /**
     * Test of getColoumn method, of class Cell.
     */
    @Test
    public void testGetColoumn() {
        System.out.println("getColoumn");
        int expResult = 2;
        int result = cell.getColoumn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRockey method, of class Cell.
     */
    @Test
    public void testGetRockey() {
        System.out.println("getRockey");
        boolean expResult = true;
        boolean result = cell.getRockey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFood method, of class Cell.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood");
        int expResult = 1;
        int result = cell.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFood method, of class Cell.
     */
    @Test
    public void testSetFood() {
        System.out.println("setFood");
        int food = 0;
        cell.setFood(food);
        assertEquals(cell.getFood(),0);
    }

    /**
     * Test of addfood method, of class Cell.
     */
    @Test
    public void testAddfood() {
        System.out.println("addfood");
        cell.setFood(1);
        cell.addfood();
        assertEquals(cell.getFood(), 2);
    }

    /**
     * Test of decreaseFood method, of class Cell.
     */
    @Test
    public void testDecreaseFood() {
        System.out.println("decreaseFood");
        cell.setFood(1);
        cell.decreaseFood();
        assertEquals(cell.getFood(), 0);
    }

    /**
     * Test of getAnthill method, of class Cell.
     */
    @Test
    public void testGetAnthill() {
        System.out.println("getAnthill");
        boolean expResult = false;
        boolean result = cell.getAnthill();
        assertEquals(expResult, result);
    }

    /**
     * Test of addAnt method, of class Cell.
     */
    @Test
    public void testAddAnt() {
        System.out.println("addAnt");
        Ant ant = null;
        cell.addAnt(ant);
    }

    /**
     * Test of isAnt method, of class Cell.
     */
    @Test
    public void testIsAnt() {
        System.out.println("isAnt");
        
        boolean expResult = false;
        boolean result = cell.isAnt();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAnt method, of class Cell.
     */
    @Test
    public void testRemoveAnt() {
        System.out.println("removeAnt");
        Ant expResult = null;
        Ant result = cell.removeAnt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNeighbours method, of class Cell.
     */
    
    /*
    @Test
    public void testGetNeighbours() {
        System.out.println("getNeighbours");
        Cell instance = null;
        Cell[] expResult = null;
        Cell[] result = instance.getNeighbours();
        assertArrayEquals(expResult, result);
    }
    */
    
    /**
     * Test of getNeighbour method, of class Cell.
     */
    /*
    @Test
    public void testGetNeighbour() {
        System.out.println("getNeighbour");
        int dir = 0;
        Cell instance = null;
        Cell expResult = null;
        Cell result = instance.getNeighbour(dir);
        assertEquals(expResult, result);
    }
    */
    
    /**
     * Test of setNeighbours method, of class Cell.
     */
    /*
    @Test
    public void testSetNeighbours() {
        System.out.println("setNeighbours");
        Cell[] neighbours = null;
        Cell instance = null;
        instance.setNeighbours(neighbours);
    }
    */
    
    /**
     * Test of setMarker method, of class Cell.
     */
    @Test
    public void testSetMarker() {
        System.out.println("setMarker");
        int colour = 0;
        int marker = 0;
        cell.setMarker(colour, marker);
    }

    /**
     * Test of removeMarker method, of class Cell.
     */
    @Test
    public void testRemoveMarker() {
        System.out.println("removeMarker");
        int colour = 0;
        int marker = 0;
        cell.removeMarker(colour, marker);
    }

    /**
     * Test of senseMarker method, of class Cell.
     */
    @Test
    public void testSenseMarker() {
        System.out.println("senseMarker");
        int colour = 0;
        int marker = 0;
        cell.setMarker(colour, marker);
        boolean expResult = true;
        boolean result = cell.senseMarker(colour, marker);
        assertEquals(expResult, result);
    }

    /**
     * Test of senseAnyMarker method, of class Cell.
     */
    @Test
    public void testSenseAnyMarker() {
        System.out.println("senseAnyMarker");
        int colour = 0;
        boolean expResult = false;
        boolean result = cell.senseAnyMarker(colour);
        assertEquals(expResult, result);
    }
    
}
