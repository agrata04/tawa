package com.geometry;

public class Angle {
	
	double degree;
	
	public Angle()
	{
		
	}
	
	public Angle(double degree)
	{
		this.degree = degree;
	}
	
	public boolean isAcute()
	{
		if(degree < 90.0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isRight()
	{
		if(degree == 90.0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isObtuse()
	{
		if(degree > 90.0)
		{
			return true;
		}
		return false;
	}
	
	

}
