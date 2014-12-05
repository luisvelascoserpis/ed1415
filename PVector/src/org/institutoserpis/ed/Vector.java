package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		
		int[] v = new int[]{12, 33, 16, 15, 7};
		int[] w = new int[]{33, 34, 40};
		
//		System.out.println("v.length=" + v.length);
//		System.out.println("v[0]=" + v[0]);
//		System.out.println("v[4]=" + v[4]);
//		System.out.println("Visitamos todos:");
//
//		show(v);
//		show(w);
		
		//int menor = min(v);
		//System.out.println("menor=" + menor);
		int index = indexOf(v, 100);
		System.out.println("index=" + index);
		
	}
	
	public static int min(int[] v) {
		int minValue = v[0];
		for (int index = 1; index < v.length; index++)
			if (v[index] < minValue)
				minValue = v[index];
		return minValue;
	}
	
	public static int indexOf(int[] v, int value) {
//		int index = 0;
//		while (index < v.length && v[index] != value)
//		//while (v[index] != value && index < v.length) ArrayIndexOutOfBoundsException
//			index++;
//		if (index == v.length) 
//			return -1;
//		return index;
		
		for (int index = 0; index < v.length; index++)
			if (v[index] == value)
				return index;
		return -1;
	}

	public static void show(int[] vector) {
		for (int index = 0; index < vector.length; index++) 
			System.out.println("valor=" + vector[index]);
	}
	
}
