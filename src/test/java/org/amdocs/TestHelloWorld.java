package org.amdocs;

import org.junit.Test;
import junit.framework.Assert;
//import main.java.org.amdocs.HelloWorld;

public class TestHelloWorld {
	
	@Test
	public void testAddIntegers() {
		String s=(String) "Hello World!!";
		HelloWorld hw = new HelloWorld();
		Assert.assertEquals(s, hw.getHelloWorld());
		System.out.println("Test 1/1 "+hw.getHelloWorld()+"="+s);
	}

}
