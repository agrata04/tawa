package com.geometry.shapes;

public class Rectangle {
	
	
	double l1,l2;
	double w1,w2;
	
	public Rectangle()
	{
		
	}
	
	public boolean FilterLength(double l1,double l2)
	{
		if(l1 == l2)
		{
			return true;
		}
		return false;
		
	}
	
	public boolean FilterWidth(double w1,double w2)
	{
		if(w1 == w2)
		{
			return true;
		}
		return false;
		
	}
	
	public boolean isRectangle()
	{
		if(FilterLength(l1,l2)&&(FilterWidth(w1,w2)))
		{
			return true;
		}
		return false;
	}
	
	public double perimeter(double l1,double w1)
	{
		this.l1 = l1;
		this.w1 = w1;
		return 2*(l1+w1);
	}
	
	public double Area(double l1,double w1)
	{
		this.l1 = l1;
		this.w1 = w1;
		return l1*w1;
	}
	
	
	
	
	
	

}
