package com.geometry.shapes;

public class Trapezium {
	
	double numSides;
	double[] sidesH = new double[2];
	double[] sidesV = new double[2];
	boolean ins;
	
	public Trapezium()
	{
		
	}

	
	public boolean isSides()
	{
		if(numSides == 4)
		{
			return true;
		}
		return false;
	}
	
	public boolean isIntersect(boolean intersect)
	{
		ins = intersect;
		if(intersect == true)
		{
			return true;
		}
		return false;
		
	}
	
	public boolean isTrapezium()
	{
		if((sidesH[0] == sidesH[1])||(sidesV[0] == sidesV[1]))
		{
	      if(isIntersect(ins))
	      {
	    	  return true;
	      }
		}
		return false;
	}
	
	

}
