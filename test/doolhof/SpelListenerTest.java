/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

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
public class SpelListenerTest {
    
    public SpelListenerTest() {
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
     * Test of repaint method, of class SpelListener.
     */
    @Test
    public void testRepaint() {
        System.out.println("repaint");
        SpelListener instance = new SpelListenerImpl();
        instance.repaint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpelstatus method, of class SpelListener.
     */
    @Test
    public void testGetSpelstatus() {
        System.out.println("getSpelstatus");
        SpelListener instance = new SpelListenerImpl();
        Spelstatus expResult = null;
        Spelstatus result = instance.getSpelstatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpelstatus method, of class SpelListener.
     */
    @Test
    public void testSetSpelstatus() {
        System.out.println("setSpelstatus");
        Spelstatus spelstatus = null;
        SpelListener instance = new SpelListenerImpl();
        instance.setSpelstatus(spelstatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableHelper method, of class SpelListener.
     */
    @Test
    public void testEnableHelper() {
        System.out.println("enableHelper");
        SpelListener instance = new SpelListenerImpl();
        instance.enableHelper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStap method, of class SpelListener.
     */
    @Test
    public void testAddStap() {
        System.out.println("addStap");
        SpelListener instance = new SpelListenerImpl();
        instance.addStap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SpelListenerImpl implements SpelListener {

        public void repaint() {
        }

        public Spelstatus getSpelstatus() {
            return null;
        }

        public void setSpelstatus(Spelstatus spelstatus) {
        }

        public void enableHelper() {
        }

        public void addStap() {
        }
    }
    
}
