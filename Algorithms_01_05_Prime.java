/*
 * Algorithms.java
 *
 *  Created on: 2013.12.03
 *      Author: Wendy
 */

/*eclipse std kepler, jdk 1.7*/

public class Algorithms 
{
	public static boolean isPrime(int N)
	{
		if(N<2) return false; //小于2不是
		for(int i=2; i*i <= N; ++i) //从最小素数2开始遍历至sqrt(N)
			if(0 == N%i) return false; //整除不是素数
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("isPrime(4) = " + isPrime(4));
		System.out.println("isPrime(17) = " + isPrime(17));
	}
}
