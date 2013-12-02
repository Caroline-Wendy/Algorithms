/*
 * Algorithms.java
 *
 *  Created on: 2013.11.28
 *      Author: Wendy
 */

/*eclipse kepler, javase-1.7*/

public class algorithms {
	//最大公约数
	public static int gcd (int p, int q)
	{
		if (q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = gcd(42, 70);
		System.out.println("Hei, the gcd is " + res + ". ");
	}
}
