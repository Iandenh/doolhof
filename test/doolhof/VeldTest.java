/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import doolhof.Item.SpelItem;
import java.awt.Graphics;
import java.util.ArrayList;
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
public class VeldTest {
    
    public VeldTest() {
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
     * Test of getSpelItem method, of class Veld.
     */
    @Test
    public void testGetSpelItem() {
        System.out.println("getSpelItem");
        Veld instance = null;
        SpelItem expResult = null;
        SpelItem result = instance.getSpelItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpelelement method, of class Veld.
     */
    @Test
    public void testSetSpelelement() {
        System.out.println("setSpelelement");
        SpelItem spelelement = null;
        Veld instance = null;
        instance.setSpelelement(spelelement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuur method, of class Veld.
     */
    @Test
    public void testGetBuur() {
        System.out.println("getBuur");
        Richting richting = null;
        Veld instance = null;
        Veld expResult = null;
        Veld result = instance.getBuur(richting);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuur method, of class Veld.
     */
    @Test
    public void testSetBuur() {
        System.out.println("setBuur");
        Richting richting = null;
        Veld veld = null;
        Veld instance = null;
        instance.setBuur(richting, veld);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getxPos method, of class Veld.
     */
    @Test
    public void testGetxPos() {
        System.out.println("getxPos");
        Veld instance = new Veld(2, 3);
        int expResult = 60;
        int result = instance.getxPos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setxPos method, of class Veld.
     */
    @Test
    public void testSetxPos() {
        System.out.println("setxPos");
        int xPos = 0;
        Veld instance = null;
        instance.setxPos(xPos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getyPos method, of class Veld.
     */
    @Test
    public void testGetyPos() {
        System.out.println("getyPos");
        Veld instance = null;
        int expResult = 0;
        int result = instance.getyPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setyPos method, of class Veld.
     */
    @Test
    public void testSetyPos() {
        System.out.println("setyPos");
        int yPos = 0;
        Veld instance = null;
        instance.setyPos(yPos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tekenVierkant method, of class Veld.
     */
    @Test
    public void testTekenVierkant() {
        System.out.println("tekenVierkant");
        Graphics g = null;
        Veld instance = null;
        instance.tekenVierkant(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tekenHelperPath method, of class Veld.
     */
    @Test
    public void testTekenHelperPath() {
        System.out.println("tekenHelperPath");
        Graphics g = null;
        Veld instance = null;
        instance.tekenHelperPath(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generatePath method, of class Veld.
     */
    @Test
    public void testGeneratePath_ArrayList() {
        System.out.println("generatePath");
        ArrayList<Veld> path = null;
        Veld instance = null;
        ArrayList<Veld> expResult = null;
        ArrayList<Veld> result = instance.generatePath(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generatePath method, of class Veld.
     */
    @Test
    public void testGeneratePath_0args() {
        System.out.println("generatePath");
        Veld instance = null;
        ArrayList<Veld> expResult = null;
        ArrayList<Veld> result = instance.generatePath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
