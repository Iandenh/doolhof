/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

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
@Suite.SuiteClasses({doolhof.Item.SpelItemTest.class, doolhof.Item.BazookaTest.class, doolhof.Item.SpelerTest.class, doolhof.Item.MuurTest.class, doolhof.Item.HelperTest.class, doolhof.Item.FinishTest.class})
public class ItemSuite {

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
