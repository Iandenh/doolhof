/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import java.awt.Graphics;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ian
 */
public class BasisspelTest {
    
    public BasisspelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of reset method, of class Basisspel.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Basisspel instance = new Basisspel();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BouwSpelveld method, of class Basisspel.
     */
    @Test
    public void testBouwSpelveld() {
        System.out.println("BouwSpelveld");
        String[][] layout = null;
        Basisspel instance = new Basisspel();
        instance.BouwSpelveld(layout);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexExists method, of class Basisspel.
     */
    @Test
    public void testIndexExists() {
        System.out.println("indexExists");
        List list = null;
        int index = 0;
        Basisspel instance = new Basisspel();
        boolean expResult = false;
        boolean result = instance.indexExists(list, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeld method, of class Basisspel.
     */
    @Test
    public void testGetVeld() {
        System.out.println("getVeld");
        int x = 0;
        int y = 0;
        Basisspel instance = new Basisspel();
        Veld expResult = null;
        Veld result = instance.getVeld(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Basisspel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Basisspel instance = new Basisspel();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpelstatus method, of class Basisspel.
     */
    @Test
    public void testSetSpelstatus() {
        System.out.println("setSpelstatus");
        Spelstatus spelstatus = null;
        Basisspel instance = new Basisspel();
        instance.setSpelstatus(spelstatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpelstatus method, of class Basisspel.
     */
    @Test
    public void testGetSpelstatus() {
        System.out.println("getSpelstatus");
        Basisspel instance = new Basisspel();
        Spelstatus expResult = null;
        Spelstatus result = instance.getSpelstatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableHelper method, of class Basisspel.
     */
    @Test
    public void testEnableHelper() {
        System.out.println("enableHelper");
        Basisspel instance = new Basisspel();
        instance.enableHelper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStap method, of class Basisspel.
     */
    @Test
    public void testAddStap() {
        System.out.println("addStap");
        Basisspel instance = new Basisspel();
        instance.addStap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
