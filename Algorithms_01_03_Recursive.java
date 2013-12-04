/*
 * Algorithms.java
 *
 *  Created on: 2013.12.03
 *      Author: Wendy
 */

/*eclipse std kepler, jdk 1.7*/

import java.util.Arrays;

public class Algorithms 
{
	public static int rank(int key, int[] a)
	{ return rank(key, a, 0, a.length-1); }
	
	public static int rank(int key, int[] a, int lo, int hi)
	{
		if (lo>hi) return -1;
		int mid = lo + (hi-lo)/2;
		if (key < a[mid]) return rank(key, a, lo, mid-1);
		else if (key > a[mid]) return rank(key, a, mid+1, hi);
		else return mid;
	}
	
	public static void main(String[] args) 
	{
		int[] a = {1, 3, 4, 5, 2, 6, 7, 8, 9, 0};
		Arrays.sort(a);
		int[] b = {4, 11, 5, 12};
		for(int i=0; i<b.length; ++i) {
			int p = rank(b[i], a);
			if(-1 == p) {
				System.out.println("failed to search " + b[i] + " : ( ");
			} else {
				//数组是有序的
				System.out.println("the " + b[i] + " position is " + p + " : ) ");
			}
		}
	}
}
