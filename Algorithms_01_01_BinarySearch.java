/*
 * Algorithms.java
 *
 *  Created on: 2013.12.02
 *      Author: Wendy
 */

/*eclipse std kepler, stdlib.jar*/

import java.util.Arrays;

public class Algorithms
{
	/*折半查找算法(binary search)*/
	public static int rank(int key, int[] a)
	{
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{
			int mid = lo + (hi - lo) /2; //整数向下取整
			if (key < a[mid]) hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts(); //读取原始数组
		Arrays.sort(whitelist); //排序
		while(!StdIn.isEmpty()) //判断重定向数据是否为空
		{
			int key = StdIn.readInt();
			if(rank(key, whitelist) == -1) //输出不存在的数据
				StdOut.println(key);
		}
	}
}