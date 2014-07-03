package com.arithmetic;

public class QuantityA{
	
	int qa;
	int qb;
	int gno;
	double gdouble;
	double q1,q2;
	
	public QuantityA()
	{
		
	}
	
	
	
	public int greater(int qa,int qb)
	{
		this.qa =qa;
		this.qb = qb;
		if(qa>qb)
		{
			gno = qa;
		}
		return gno;
		
	}
	
	public double greater(double q1,double q2)
	{
		this.q1=q1;
		this.q2=q2;
		if(q1 > q2)
		{
		gdouble = q1;	
		}
		return q1;
	}
	
	

}
