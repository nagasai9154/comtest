package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testing{

	build obj = new build();
	
	@Test
	public void twoPlusTwoEqualsFour(){
		assertEquals(4,obj.adder(2, 2));
	}
}
