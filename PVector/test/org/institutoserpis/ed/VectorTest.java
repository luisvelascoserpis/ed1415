package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class VectorTest {

	@Test
	public void testMin() {
		assertEquals(7, Vector.min(new int[] {12, 33, 16, 15, 7}));
		assertEquals(9, Vector.min(new int[] {9, 33, 16, 15, 17}));
		assertEquals(15, Vector.min(new int[] {19, 33, 16, 15, 17}));
	}

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testMinEmpty() {
		Vector.min(new int[] {});
	}
	
	@Test
	public void testIndexOf() {
		int[] v = new int[]{12, 33, 15, 7};
		assertEquals(0, Vector.indexOf(v, 12) );
		assertEquals(3, Vector.indexOf(v, 7) );
		assertEquals(1, Vector.indexOf(v, 33) );
		assertEquals(-1, Vector.indexOf(v, 100) );
	}
	
	@Test
	public void testIndexOfEmpty() {
		int[] v = new int[]{}; // new int[0];
		assertEquals(-1, Vector.indexOf(v, 12));
		
	}
	
	@Test
	public void testSelectionSort() {
		int[] v;
		//v desordenado
		v = new int[] {12, 33, 16, 15, 7};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7, 12, 15, 16, 33}, v);
		//v ordenado ascendentemente
		v = new int[]{7, 12, 15, 16, 33};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7, 12, 15, 16, 33}, v);
		//v ordenado descendentemente
		v = new int[]{33, 16, 15, 12, 7};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7, 12, 15, 16, 33}, v);

		//v desordenado con repetidos
		v = new int[] {12, 33, 7, 15, 7};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7, 7, 12, 15, 33}, v);
		//v ordenado ascendentemente con repetidos
		v = new int[]{7, 7, 12, 15, 33};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7, 7, 12, 15, 33}, v);
		//v ordenado descendentemente con repetidos
		v = new int[]{33, 15, 12, 7, 7};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{7, 7, 12, 15, 33}, v);
	}

	@Test
	public void testSelectionSortEmpty() {
		int[] v = new int[]{};
		Vector.selectionSort(v);
		assertArrayEquals(new int[]{}, v);
	}

}
