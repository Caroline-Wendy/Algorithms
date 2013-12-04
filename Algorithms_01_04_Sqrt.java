/*
 * Algorithms.java
 *
 *  Created on: 2013.12.03
 *      Author: Wendy
 */

/*eclipse std kepler, jdk 1.7*/

public class Algorithms 
{
	public static double sqrt(double c)
	{
		if(c<0) return Double.NaN; //NaN: not a number
		double err = 1e-15; //极小值
		double t = c;
		while (Math.abs(t-c/t) > err*t) //t^2接近c, 防止小数
			t = (c/t + t)/2.0;
		return t;
	}
	
	public static double cbrt(double c)
	{
		boolean b = (c>0) ? true : false; //保存c的符号
		c = (c>0) ? c : -c;
		double err = 1e-15;
		double t = c;
		while(Math.abs(t*t-c/t) > err*t)
			t = (c/(t*t)+t)/2.0;
		t = (b) ? t : -t;
		return t;
	}
	
	public static void main(String[] args) 
	{
		double r = sqrt(4.0);
		System.out.println("sqrt(4.0) = " + r);
		double rc = cbrt(-27.0);
		System.out.println("cbrt(9.0) = " + rc);
	}
}
