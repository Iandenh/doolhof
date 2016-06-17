/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

import doolhof.Richting;
import doolhof.Basisspel;
import doolhof.Veld;
import doolhof.level.Level;
import doolhof.level.Level1;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
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
public class SpelerTest {
    
    public SpelerTest() {
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
     * Test of beweeg method, of class Speler.
     */
    @org.junit.Test
    public void testBeweegOmhoog() {
        System.out.println("beweeg");
        Level level = new Level1();
        Basisspel spel = new Basisspel();
        spel.BouwSpelveld(level.getLevel());
        Veld speler = spel.getSpelerVeld();
        Speler spelerItem = (Speler) speler.getSpelItem();
        spelerItem.beweeg(Richting.OMHOOG);
        int expXResult = 60;//blijft op 30 staan (1 hokje is 30)
        int expYResult = 30;//blijft op 30 staan (1 hokje is 30)
        speler = spel.getSpelerVeld(); //haalt veld op waar speler staat
        assertEquals(expYResult, speler.getyPos());
        assertEquals(expXResult, speler.getxPos());
    }
    
    @org.junit.Test
    public void testBeweegLinks() {
        System.out.println("beweeg");
        Level level = new Level1();
        Basisspel spel = new Basisspel();
        spel.BouwSpelveld(level.getLevel());
        Veld speler = spel.getSpelerVeld();
        Speler spelerItem = (Speler) speler.getSpelItem();
        spelerItem.beweeg(Richting.LINKS);
        speler = spel.getSpelerVeld();
        int expXResult = 30;//blijft op 30 staan (1 hokje is 30)
        int expYResult = 30;//blijft op 30 staan (1 hokje is 30)
        
        assertEquals(expYResult, speler.getyPos());
        assertEquals(expXResult, speler.getxPos());
    }
    
    @org.junit.Test
    public void testBeweegRechts() {
        System.out.println("beweeg");
        Level level = new Level1();
        Basisspel spel = new Basisspel();
        spel.BouwSpelveld(level.getLevel());
        Veld speler = spel.getSpelerVeld();
        Speler spelerItem = (Speler) speler.getSpelItem();
        spelerItem.beweeg(Richting.RECHTS);
        speler = spel.getSpelerVeld();
        int expXResult = 60;//blijft op 30 staan (1 hokje is 30)
        int expYResult = 30;//blijft op 30 staan (1 hokje is 30)
        
        assertEquals(expYResult, speler.getyPos());
        assertEquals(expXResult, speler.getxPos());
    }
    
    @org.junit.Test
    public void testBeweegOmlaag() {
        System.out.println("beweeg");
        Level level = new Level1();
        Basisspel spel = new Basisspel();
        spel.BouwSpelveld(level.getLevel());
        Veld speler = spel.getSpelerVeld();
        Speler spelerItem = (Speler) speler.getSpelItem();
        spelerItem.beweeg(Richting.OMLAAG);
        speler = spel.getSpelerVeld();
        int expXResult = 60;//blijft op 30 staan (1 hokje is 30)
        int expYResult = 30;//blijft op 30 staan (1 hokje is 30)
        
        assertEquals(expYResult, speler.getyPos());
        assertEquals(expXResult, speler.getxPos());
    }
    
    @org.junit.Test
    public void testSchiet() {
        System.out.println("beweeg");
        Level level = new Level1();
        Basisspel spel = new Basisspel();
        spel.BouwSpelveld(level.getLevel());
        Veld speler = spel.getSpelerVeld();
        Speler spelerItem = (Speler) speler.getSpelItem();
        spelerItem.setWapen(new Bazooka(speler, spel));
        spelerItem.schiet(Richting.RECHTS);
        Veld muur = spel.getVeld(90, 30);
        if(muur.getSpelItem() instanceof Muur){
            fail("Is niet geschoten");
        }
        assertTrue(true);
        
    }
    
    @org.junit.Test
    public void testSchietZonderWapen() {
        System.out.println("beweeg");
        Level level = new Level1();
        Basisspel spel = new Basisspel();
        spel.BouwSpelveld(level.getLevel());
        Veld speler = spel.getSpelerVeld();
        Speler spelerItem = (Speler) speler.getSpelItem();
        spelerItem.schiet(Richting.RECHTS);
        Veld muur = spel.getVeld(90, 30);
        if(!(muur.getSpelItem() instanceof Muur)){
            fail("Geschoten zonder wapen");
        }
        assertTrue(true);
        
    }

    
    
}
