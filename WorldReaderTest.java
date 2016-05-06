/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freakin
 */
public class WorldReaderTest {
    
    public WorldReaderTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getWorldCharArray method, of class WorldReader.
     */
    @Test
    public void testGetWorldCharArray() {
        System.out.println("getWorldCharArray");
        WorldReader instance = null;
        try {
            instance = new WorldReader();
        } catch (IOException ex) {
            Logger.getLogger(WorldReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        char[][] expResult = null;
        char[][] result = instance.getWorldCharArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class WorldReader.
     */
    @Test
    public void testGetX() throws IOException {
        System.out.println("getX");
        WorldReader instance = new WorldReader();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class WorldReader.
     */
    @Test
    public void testGetY() throws IOException {
        System.out.println("getY");
        WorldReader instance = new WorldReader();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
