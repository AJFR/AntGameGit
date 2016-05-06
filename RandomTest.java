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
public class RandomTest {
    
    public RandomTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getNextX method, of class Random.
     */
    
    /*
    @Test
    public void testGetNextX() {
        System.out.println("getNextX");
        Random instance = null;
        int expResult = 0;
        int result = instance.getNextX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of modulus method, of class Random.
     */
    /*
    @Test
    public void testModulus() {
        System.out.println("modulus");
        int x = 0;
        int mod = 0;
        Random instance = null;
        int expResult = 0;
        int result = instance.modulus(x, mod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of randomInt method, of class Random.
     */
    
    @Test
    public void testRandomInt() {
        System.out.println("randomInt");
        int n = 0;
        Random instance = new Random(12345);
        int expResult = 0;
        int result = instance.randomInt(n);
        assertEquals(expResult, result);
    }
    
}
