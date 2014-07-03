package com.geometry;

public class TriangleType {
	
	
	double side1,side2,side3;
	
	public TriangleType()
	{
		
	}
	
	public TriangleType(double side1,double side2,double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public boolean isEqui(){
		
		if((side1 == side2)&&(side2 == side3)&&(side3 == side1))
		{
			return true;
		}
		
		
		return false;
		
		
	}
	
	public boolean isIsoceles()
	{
		if((side1 == side2)||(side2 == side3)||(side3 == side1))
		{
			return true;
		}
		
		
		
		return false;
		
	}
	
	public boolean isScalene()
	{
		if((side1 != side2)&&(side2 != side3)&&(side3 != side1))
		{
			return true;
		}
		return false;
		
	}
}
