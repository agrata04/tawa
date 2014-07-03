package com.geometry.shapes;

public class Square {
	
	double[] sides = new double[4];
	double s;
	
	public Square()
	{
		
	}
	
	public boolean isSquare(double[] sides)
	{
		this.sides = sides;
		for(int i=0;i<sides.length;i++)
		{
			if(sides[i]==sides[i+1])
			{
				return true;
			}
		}
		
		
		return false;
		
		
	}
	
	public double Area(double side)
	{
		s = side;
		return s*s;
	}
	
	public double perimeter(double side)
	{
		s = side;
		return 4*s;
	}

}
