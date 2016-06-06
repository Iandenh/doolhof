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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({doolhof.BasisspelTest.class, doolhof.SpelstatusTest.class, doolhof.RichtingTest.class, doolhof.SpelListenerTest.class, doolhof.DoolhofTest.class, doolhof.VeldTest.class, doolhof.Item.ItemSuite.class, doolhof.level.LevelSuite.class})
public class DoolhofSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
