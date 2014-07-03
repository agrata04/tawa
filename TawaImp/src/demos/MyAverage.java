package demos;

import com.arithmetic.Average;

public class MyAverage {
	
	Average ag;
	double[] n = {33.0,64.0};
	
	public MyAverage()
	{
		ag = new Average(2,n);
		
	}
	
	public void printAG()
	{
		System.out.println(ag.calculate());
	}
	
	public static void main(String[] args)
	{
		MyAverage myav = new MyAverage();
		myav.printAG();
	}

}
