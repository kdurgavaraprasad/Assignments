/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabonacci;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pk3971
 */
public class FabonacciCaliculationTest {
    
    public FabonacciCaliculationTest() {
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
     * Test of Fibonacci method, of class FabonacciCaliculation.
     */
    @Test
    public void testFibonacci() {
        System.out.println("Fibonacci");
        int n = 8;
        long expResult = 21;
        long result = FabonacciCaliculation.Fibonacci(n);
        assertEquals(expResult, result);
      
    }
    @Test
    public void test_Fibonacci_with_Minvalues_0_and_1() {
        assertEquals("Fibonacci(0)", 0, FabonacciCaliculation.Fibonacci(0));
        assertEquals("Fibonacci(1)", 1, FabonacciCaliculation.Fibonacci(1));
    }
    /** Tests inductive cases of the Fibonacci sequence */
    @Test
    public void test_Fibonacci_Series_of_Numbers() {
            int[][] fibcases = new int[][] {
                    { 3, 2 },{ 4, 3 },{ 5, 5 },{ 6, 8 },{ 7, 13 },{ 8, 21 },{40,102334155}  };
            for (int i = 0; i < fibcases.length; i++) {
		assertEquals("Fibonacci(" + fibcases[i][0] + ")",
                             fibcases[i][1], FabonacciCaliculation.Fibonacci(fibcases[i][0]));
            }
       
    }

  
    @Test
    public void test_if_there_is_any_exception_leaks() {

    try {
    FabonacciCaliculation.Fibonacci(0);
    } catch (Exception ex) {
    fail("Threw IllegalArgumentException for 0 but 0 is nonnegative: "+ ex);
    }

    }
}
