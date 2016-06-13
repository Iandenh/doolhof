/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

import doolhof.Basisspel;
import doolhof.Veld;
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
public class CheaterTest {
    
    public CheaterTest() {
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
     * Test of getStappen method, of class Cheater.
     */
    @Test
    public void testGetStappen() {
        System.out.println("getStappen");
        Cheater instance = new Cheater(new Veld(1,1), new Basisspel(), 50);
        int expResult = 50;
        int result = instance.getStappen();
        assertEquals(expResult, result);
    }
    
}
