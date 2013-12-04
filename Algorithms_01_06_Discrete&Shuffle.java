/*
 * Algorithms.java
 *
 *  Created on: 2013.12.03
 *      Author: Wendy
 */

/*eclipse std kepler, jdk 1.7*/

public class Algorithms 
{
	//根据输入的概率数组, 随机输出离散的值
	public static int discrete(double[] a)
	{
		double r = StdRandom.uniform();
		double sum = 0.0;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
			if(sum >= r) return i;
		}
		return -1;
	}
	
	//重置(洗牌), 把数组值的顺序打乱
	public static void shuffle(double[] a)
	{
		int N = a.length;
		for(int i=0; i<N; ++i)
		{
			int r = i + StdRandom.uniform(N-i); //"[ )"不能达到N-i, 最大N-i-1
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	
	public static void main(String[] args) 
	{
		double[] a = {0.1, 0.4, 0.3, 0.2};
		StdOut.println("discrete value = " + discrete(a));
		shuffle(a);
		StdOut.print("shuffle : ");
		for(int i=0; i<a.length; ++i){
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
}









