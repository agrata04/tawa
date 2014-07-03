package com.arithmetic;

public class Average{
	
	int no;
	int n;
	double[] nums = new double[n];
	double t1 = 0.00;
	double aver;
	
	public Average()
	{
		
	}

	public Average(int no,double[] nums)
	{
		this.no=no;
		this.nums=nums;
		
		
	}
	
	public double calculate()
	{
		for(int i=0;i<nums.length;i++)
		{
			t1 = t1 + nums[i];
			
		}
		aver = t1/no;
		
		return aver;
		
	}
}
