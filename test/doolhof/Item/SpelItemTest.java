/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

import doolhof.Richting;
import java.awt.Graphics;
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
public class SpelItemTest {
    
    public SpelItemTest() {
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
     * Test of tekenPlaatje method, of class SpelItem.
     */
    @Test
    public void testTekenPlaatje() {
        System.out.println("tekenPlaatje");
        Graphics g = null;
        SpelItem instance = null;
        instance.tekenPlaatje(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaatje method, of class SpelItem.
     */
    @Test
    public void testSetPlaatje() {
        System.out.println("setPlaatje");
        SpelItem spelelement = null;
        SpelItem instance = null;
        instance.setPlaatje(spelelement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beweeg method, of class SpelItem.
     */
    @Test
    public void testBeweeg() {
        System.out.println("beweeg");
        Richting richting = null;
        SpelItem instance = null;
        instance.beweeg(richting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of schiet method, of class SpelItem.
     */
    @Test
    public void testSchiet() {
        System.out.println("schiet");
        Richting richting = null;
        SpelItem instance = null;
        instance.schiet(richting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
