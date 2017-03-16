/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhatanh;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sang
 */
public class NhatAnhIT
{

    public NhatAnhIT()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of checkPrime method, of class NhatAnh.
     */
    @Test
    public void testCheckPrime()
    {
        System.out.println("checkPrime");
        int n = 0;
        boolean expResult = false;
        boolean result = nhatanh.NhatAnh.checkPrime(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPrime2()
    {
        System.out.println("checkPrime");
        int n = 11;
        boolean expResult = true;
        boolean result = nhatanh.NhatAnh.checkPrime(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPrime3()
    {
        System.out.println("checkPrime");
        int n = -11;
        boolean expResult = false;
        boolean result = nhatanh.NhatAnh.checkPrime(n);
        assertEquals(expResult, result);
    }

    @Test(expected = NumberFormatException.class)
    public void testCheckPrime4()
    {
        System.out.println("checkPrime");
        int n = Integer.parseInt("avd");
        boolean result = nhatanh.NhatAnh.checkPrime(n);
    }

    @Test(timeout = 2000)
    public void testCheckPrime5()
    {
        System.out.println("checkPrime");
        int n = 3;
        boolean result = nhatanh.NhatAnh.checkPrime(n);

    }

}
