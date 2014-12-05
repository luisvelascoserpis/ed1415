package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	@Test
	public void testMin() {
		assertEquals(7, Vector.min(new int[] {12, 33, 16, 15, 7}));
		assertEquals(9, Vector.min(new int[] {9, 33, 16, 15, 17}));
		assertEquals(15, Vector.min(new int[] {19, 33, 16, 15, 17}));
	}

	@Test
	public void testIndexOf() {
		int[] v = new int[]{12, 33, 15, 7};
		assertEquals(0, Vector.indexOf(v, 12) );
		assertEquals(3, Vector.indexOf(v, 7) );
		assertEquals(1, Vector.indexOf(v, 33) );
		assertEquals(-1, Vector.indexOf(v, 100) );
	}

}
