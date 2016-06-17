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

    
    
}
