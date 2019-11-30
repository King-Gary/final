/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

import org.junit.Assert;
import static org.junit.Assert.*;



import org.junit.Test;
/**
 *
 * @author Gary
 */
class AddTest {

    private int newNumbers;
    
	public void testAdd () {

		junit test = new  junit();

		int result = test.add(3, 4);
                int nonTest = 3+7;
		assertEquals(7, result);	
                
                int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
                int[] tests = new int[] {1,2,3,4,5,6,7,8,9};
                Assert.assertArrayEquals(numbers, tests);
                
                assertTrue("This is bound to succeed.", true);
                assertTrue("This is doomed to fail!", false);

                assertFalse("This is bound to succeed.", false);
                assertFalse("This is doomed to fail!", true);
                
                assertNull("This message contains nothing", result);
                assertNotNull("This message does contain something", result);
                assertSame("These objects are the same", result, nonTest);
                assertNotSame("These objects are not the same", result, nonTest);
                
	}
}
