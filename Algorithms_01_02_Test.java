/*
 * Test.java
 *
 *  Created on: 2013.12.02
 *      Author: Wendy
 */

/*eclipse std kepler*/

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("2.0 - 2.0e-7 = " + (2.0 - 2.0e-7));
		int N = 5, i = 1;
		int[] a = new int[N];
		a[i] = 1234;
		int[] b = a; //别名, 没有新建b
		b[i] = 5678;
		System.out.println("a[" + i + "] = " + a[i]);
	}
}
