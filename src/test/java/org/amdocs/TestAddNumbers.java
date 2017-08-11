package org.amdocs;

import org.junit.Test;
import junit.framework.Assert;


public class TestAddNumbers {
	
	@Test
	public void testAddIntegers1() {
		AddNumbers an = new AddNumbers();
		Assert.assertEquals(5, an.addIntegers(1, 4));		
	}
	
	@Test
	public void testAddIntegers2() {
		AddNumbers an = new AddNumbers();
		Assert.assertEquals(6, an.addIntegers(2, 4));		
	}

}
