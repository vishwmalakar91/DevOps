package org.amdocs;

import org.junit.Test;
import junit.framework.Assert;

public class TestHelloWorld {
	
	@Test
	public void testAddIntegers() {
		HelloWorld hw = new HelloWorld();
		System.out.print("Test Helo World");
		Assert.assertEquals("Hello World!!", hw.getHelloWorld());
	}

}
