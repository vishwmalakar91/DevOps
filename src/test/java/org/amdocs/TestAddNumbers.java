package org.amdocs;

import org.junit.Test;
import junit.framework.Assert;


public class TestAddNumbers {
	
	@Test
	public void testAddIntegers1() {
		int x=1;
		int y=5;
		int z=6;
		AddNumbers an = new AddNumbers();
		Assert.assertEquals(z, an.addIntegers(x, y));
		System.out.println("Test 1/2: addIntegers :"+x+"+"+y+"="+z);
	}
	
	@Test
	public void testAddIntegers2() {
		int x=5;
		int y=5;
		int z=10;
		AddNumbers an = new AddNumbers();
		Assert.assertEquals(z, an.addIntegers(x,y));
		System.out.println("Test 2/2: addIntegers :"+x+"+"+y+"="+z);
	}

}
