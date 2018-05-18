/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mersenneprime;

import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kylerudy
 */
public class MersennePrimeTest {
    
    public MersennePrimeTest() {
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
     * Test of squareRoot method, of class MersennePrime.
     */
    @Test
    public void testSquareRoot() {
        MersennePrime mp = new MersennePrime();
        
        assertEquals(BigInteger.valueOf(4), mp.squareRoot(BigInteger.valueOf(16)));
        assertEquals(BigInteger.valueOf(10), mp.squareRoot(BigInteger.valueOf(100)));
        assertEquals(BigInteger.valueOf(144), mp.squareRoot(BigInteger.valueOf(20736)));
        assertEquals(BigInteger.valueOf(256), mp.squareRoot(BigInteger.valueOf(65536)));
    }
    
}
