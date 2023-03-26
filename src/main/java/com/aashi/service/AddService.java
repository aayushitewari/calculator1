package com.aashi.service;

public class AddService 
{
	
	public int op(int i, int j,String opr)
	{
		if (opr.equals("+"))
		{
			return i+j;
			}
		else if (opr.equals("-"))
		{
			return i-j;
		}
		else if (opr.equals("*"))
		{
			return i*j;
		}
		else if (opr.equals("/"))
		{
			return i/j;
			
		}
		return -1;
}
}

	
	


